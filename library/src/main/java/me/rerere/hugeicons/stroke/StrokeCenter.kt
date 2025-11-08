package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeCenter: ImageVector
    get() {
        if (_strokeCenter != null) {
            return _strokeCenter!!
        }
        _strokeCenter = ImageVector.Builder(
            name = "StrokeCenter",
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
        moveTo(8f, 22f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 22f, 20.8284f, 22f, 21.4142f, 21.4142f)
        curveTo(22f, 20.8284f, 22f, 19.8856f, 22f, 18f)
        verticalLineTo(17f)
        curveTo(22f, 15.1144f, 22f, 14.1716f, 21.4142f, 13.5858f)
        curveTo(20.8284f, 13f, 19.8856f, 13f, 18f, 13f)
        lineTo(15f, 13f)
        curveTo(13.1144f, 13f, 12.1716f, 13f, 11.5858f, 12.4142f)
        curveTo(11f, 11.8284f, 11f, 10.8856f, 11f, 9f)
        verticalLineTo(6f)
        curveTo(11f, 4.11438f, 11f, 3.17157f, 10.4142f, 2.58579f)
        curveTo(9.82843f, 2f, 8.88562f, 2f, 7f, 2f)
        lineTo(6f, 2f)
        curveTo(4.11438f, 2f, 3.17157f, 2f, 2.58579f, 2.58579f)
        curveTo(2f, 3.17157f, 2f, 4.11438f, 2f, 6f)
        lineTo(2f, 16f)
        curveTo(2f, 18.8284f, 2f, 20.2426f, 2.87868f, 21.1213f)
        curveTo(3.75736f, 22f, 5.17157f, 22f, 8f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16.5f)
        curveTo(10f, 17.8807f, 8.88071f, 19f, 7.5f, 19f)
        curveTo(6.11929f, 19f, 5f, 17.8807f, 5f, 16.5f)
        curveTo(5f, 15.1193f, 6.11929f, 14f, 7.5f, 14f)
        curveTo(8.88071f, 14f, 10f, 15.1193f, 10f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 10f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17.5f)
        horizontalLineTo(22f)
        }
        }.build()

        return _strokeCenter!!
    }

private var _strokeCenter: ImageVector? = null
