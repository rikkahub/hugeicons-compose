package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DatabaseSync: ImageVector
    get() {
        if (_databaseSync != null) {
            return _databaseSync!!
        }
        _databaseSync = ImageVector.Builder(
            name = "DatabaseSync",
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
        moveTo(12.9999f, 17f)
        lineTo(14.0226f, 17.5944f)
        curveTo(14.5372f, 15.7277f, 16.5112f, 14.6199f, 18.4317f, 15.1201f)
        curveTo(19.4148f, 15.3761f, 20.1933f, 16.0039f, 20.65f, 16.806f)
        moveTo(21.9999f, 20f)
        lineTo(20.9773f, 19.4056f)
        curveTo(20.4627f, 21.2723f, 18.4887f, 22.3801f, 16.5682f, 21.8799f)
        curveTo(15.608f, 21.6298f, 14.8429f, 21.0251f, 14.3823f, 20.2496f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        verticalLineTo(11.5f)
        curveTo(21f, 7.02166f, 21f, 4.78249f, 19.6088f, 3.39124f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39124f)
        curveTo(2f, 4.78249f, 2f, 7.02166f, 2f, 11.5f)
        curveTo(2f, 15.9783f, 2f, 18.2175f, 3.39124f, 19.6088f)
        curveTo(4.61763f, 20.8351f, 6.50289f, 20.9805f, 10f, 20.9977f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 6.5f)
        lineTo(16.5f, 6.5f)
        }
        }.build()

        return _databaseSync!!
    }

private var _databaseSync: ImageVector? = null
