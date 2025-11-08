package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ParkingAreaSquare: ImageVector
    get() {
        if (_parkingAreaSquare != null) {
            return _parkingAreaSquare!!
        }
        _parkingAreaSquare = ImageVector.Builder(
            name = "ParkingAreaSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13f)
        verticalLineTo(8.4f)
        curveTo(9f, 8.02774f, 9f, 7.84162f, 9.04894f, 7.69098f)
        curveTo(9.14786f, 7.38655f, 9.38655f, 7.14786f, 9.69098f, 7.04894f)
        curveTo(9.84162f, 7f, 10.0277f, 7f, 10.4f, 7f)
        horizontalLineTo(13f)
        curveTo(14.6569f, 7f, 16f, 8.34315f, 16f, 10f)
        curveTo(16f, 11.6569f, 14.6569f, 13f, 13f, 13f)
        horizontalLineTo(9f)
        moveTo(9f, 13f)
        verticalLineTo(18f)
        }
        }.build()

        return _parkingAreaSquare!!
    }

private var _parkingAreaSquare: ImageVector? = null
