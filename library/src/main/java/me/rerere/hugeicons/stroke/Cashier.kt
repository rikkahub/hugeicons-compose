package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cashier: ImageVector
    get() {
        if (_cashier != null) {
            return _cashier!!
        }
        _cashier = ImageVector.Builder(
            name = "Cashier",
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
        moveTo(16.6667f, 14f)
        lineTo(7.33333f, 14f)
        curveTo(5.14718f, 14f, 4.0541f, 14f, 3.27927f, 14.5425f)
        curveTo(2.99261f, 14.7433f, 2.74327f, 14.9926f, 2.54254f, 15.2793f)
        curveTo(2f, 16.0541f, 2f, 17.1472f, 2f, 19.3333f)
        curveTo(2f, 20.4264f, 2f, 20.9729f, 2.27127f, 21.3604f)
        curveTo(2.37164f, 21.5037f, 2.4963f, 21.6284f, 2.63963f, 21.7287f)
        curveTo(3.02705f, 22f, 3.57359f, 22f, 4.66667f, 22f)
        lineTo(19.3333f, 22f)
        curveTo(20.4264f, 22f, 20.9729f, 22f, 21.3604f, 21.7287f)
        curveTo(21.5037f, 21.6284f, 21.6284f, 21.5037f, 21.7287f, 21.3604f)
        curveTo(22f, 20.9729f, 22f, 20.4264f, 22f, 19.3333f)
        curveTo(22f, 17.1472f, 22f, 16.0541f, 21.4575f, 15.2793f)
        curveTo(21.2567f, 14.9926f, 21.0074f, 14.7433f, 20.7207f, 14.5425f)
        curveTo(19.9459f, 14f, 18.8528f, 14f, 16.6667f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        lineTo(19.593f, 10.3374f)
        curveTo(19.311f, 7.79863f, 19.1699f, 6.52923f, 18.3156f, 5.76462f)
        curveTo(17.4614f, 5f, 16.1842f, 5f, 13.6297f, 5f)
        lineTo(10.3703f, 5f)
        curveTo(7.81585f, 5f, 6.53864f, 5f, 5.68436f, 5.76462f)
        curveTo(4.83009f, 6.52923f, 4.68904f, 7.79862f, 4.40695f, 10.3374f)
        lineTo(4f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 2f)
        horizontalLineTo(14f)
        moveTo(16.5f, 2f)
        horizontalLineTo(14f)
        moveTo(14f, 2f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 17.5f)
        lineTo(9.99615f, 18.1641f)
        curveTo(10.3247f, 18.3831f, 10.7107f, 18.5f, 11.1056f, 18.5f)
        horizontalLineTo(12.8944f)
        curveTo(13.2893f, 18.5f, 13.6753f, 18.3831f, 14.0038f, 18.1641f)
        lineTo(15f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8f)
        horizontalLineTo(10f)
        }
        }.build()

        return _cashier!!
    }

private var _cashier: ImageVector? = null
