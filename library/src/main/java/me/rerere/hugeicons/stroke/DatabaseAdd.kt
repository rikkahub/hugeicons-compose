package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DatabaseAdd: ImageVector
    get() {
        if (_databaseAdd != null) {
            return _databaseAdd!!
        }
        _databaseAdd = ImageVector.Builder(
            name = "DatabaseAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15f)
        curveTo(6.58172f, 15f, 3f, 13.6569f, 3f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        verticalLineTo(11.5f)
        moveTo(3f, 5f)
        verticalLineTo(19f)
        curveTo(3f, 20.6569f, 6.58172f, 22f, 11f, 22f)
        curveTo(11.1679f, 22f, 11.3346f, 21.9981f, 11.5f, 21.9942f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 16.6667f)
        verticalLineTo(18f)
        moveTo(17f, 18f)
        verticalLineTo(19.3333f)
        moveTo(17f, 18f)
        horizontalLineTo(18.3333f)
        moveTo(17f, 18f)
        horizontalLineTo(15.6667f)
        moveTo(21f, 18f)
        curveTo(21f, 20.2091f, 19.2091f, 22f, 17f, 22f)
        curveTo(14.7909f, 22f, 13f, 20.2091f, 13f, 18f)
        curveTo(13f, 15.7909f, 14.7909f, 14f, 17f, 14f)
        curveTo(19.2091f, 14f, 21f, 15.7909f, 21f, 18f)
        }
        }.build()

        return _databaseAdd!!
    }

private var _databaseAdd: ImageVector? = null
