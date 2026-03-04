package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirportTower: ImageVector
    get() {
        if (_airportTower != null) {
            return _airportTower!!
        }
        _airportTower = ImageVector.Builder(
            name = "AirportTower",
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
        moveTo(20.1228f, 6f)
        horizontalLineTo(3.87715f)
        curveTo(3.39271f, 6f, 3f, 6.39271f, 3f, 6.87715f)
        curveTo(3f, 6.95865f, 3.01136f, 7.03976f, 3.03375f, 7.11812f)
        lineTo(4.17111f, 11.0989f)
        curveTo(4.57006f, 12.4952f, 4.76954f, 13.1934f, 5.30421f, 13.5967f)
        curveTo(5.83888f, 14f, 6.56499f, 14f, 8.01721f, 14f)
        horizontalLineTo(15.9828f)
        curveTo(17.435f, 14f, 18.1611f, 14f, 18.6958f, 13.5967f)
        curveTo(19.2305f, 13.1934f, 19.4299f, 12.4952f, 19.8289f, 11.0989f)
        lineTo(20.9663f, 7.11812f)
        curveTo(20.9886f, 7.03976f, 21f, 6.95865f, 21f, 6.87715f)
        curveTo(21f, 6.39271f, 20.6073f, 6f, 20.1228f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        lineTo(15f, 14f)
        moveTo(9f, 14f)
        lineTo(8f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        verticalLineTo(22f)
        moveTo(9f, 14f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(6f)
        }
        }.build()

        return _airportTower!!
    }

private var _airportTower: ImageVector? = null
