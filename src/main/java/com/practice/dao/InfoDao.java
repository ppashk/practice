package com.practice.dao;

import com.practice.entity.Info;
import org.apache.log4j.Logger;

import java.util.List;

public class InfoDao extends AbstractDao<Info> {
    private static final Logger LOG = Logger.getLogger(InfoDao.class);

    private static final String DESTINATIONS = "destinations";
    private static final String LAST_MINUTE_ONE = "last_minute_one";
    private static final String LAST_MINUTE_TWO = "last_minute_two";

    private static final String SELECT_ALL = "SELECT * FROM info";

    private static final String INSERT_INTO = "INSERT INTO info ("
            + DESTINATIONS + ", "
            + LAST_MINUTE_ONE + ", "
            + LAST_MINUTE_TWO + ") VALUE (?, ?, ?)";

    private static final String UPDATE = "UPDATE info SET "
            + DESTINATIONS + "= ?, "
            + LAST_MINUTE_ONE + "= ?, "
            + LAST_MINUTE_TWO + "= ? WHERE "
            + ID + " = ?";

    private static final String DELETE = "DELETE FROM info "
            + "WHERE " + ID + " = ?";

    private EntityMapper<Info> getMapper() {
        return resultSet -> new Info(resultSet.getInt(ID),
                resultSet.getString(DESTINATIONS),
                resultSet.getString(LAST_MINUTE_ONE),
                resultSet.getString(LAST_MINUTE_TWO));
    }

    @Override
    public Info getById(int id) {
        return getElement("SELECT * FROM info WHERE id = ?",
                ps -> ps.setInt(1, id),
                getMapper());
    }

    @Override
    public List<Info> getAll(){
        return getElements(SELECT_ALL,
                getMapper());
    }

    @Override
    public List<Info> getAll(boolean ordered) {
        return null;
    }

    @Override
    public List<Info> getAll(String orderId) {
        return null;
    }

    @Override
    public boolean create(Info entity) {
        LOG.debug("Create order: + " + entity);
        return createUpdate(INSERT_INTO, ps -> {
            ps.setString(1, entity.getDestinations());
            ps.setString(2, entity.getLastMinuteOne());
            ps.setString(3, entity.getGetLastMinuteTwo());
        });
    }

    @Override
    public boolean update(Info entity) {
        LOG.debug("Update order: " + entity);
        return createUpdate(UPDATE, ps -> {
            ps.setString(1, entity.getDestinations());
            ps.setString(2, entity.getLastMinuteOne());
            ps.setString(3, entity.getGetLastMinuteTwo());
            ps.setInt(4, entity.getId());
        });
    }

    @Override
    public boolean remove(Info entity){
        LOG.debug("Delete order: " + entity);
        return createUpdate(DELETE,
                ps -> ps.setInt(1, entity.getId()));
    }

    @Override
    public boolean query(String query) {
        LOG.debug("Executed query: " + query);
        return createUpdate(query);
    }
}
