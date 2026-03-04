package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ElectricityStack: ImageVector
    get() {
        if (_electricityStack != null) {
            return _electricityStack!!
        }
        _electricityStack = ImageVector.Builder(
            name = "ElectricityStack",
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
        moveTo(13f, 3f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 3f, 19.2426f, 3f, 20.1213f, 3.87868f)
        curveTo(21f, 4.75736f, 21f, 6.17157f, 21f, 9f)
        verticalLineTo(11f)
        curveTo(21f, 13.8284f, 21f, 15.2426f, 20.1213f, 16.1213f)
        curveTo(19.2426f, 17f, 17.8284f, 17f, 15f, 17f)
        horizontalLineTo(13f)
        curveTo(10.1716f, 17f, 8.75736f, 17f, 7.87868f, 16.1213f)
        curveTo(7f, 15.2426f, 7f, 13.8284f, 7f, 11f)
        verticalLineTo(9f)
        curveTo(7f, 6.17157f, 7f, 4.75736f, 7.87868f, 3.87868f)
        curveTo(8.75736f, 3f, 10.1716f, 3f, 13f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20.1213f)
        curveTo(15.1213f, 21f, 13.7071f, 21f, 10.8787f, 21f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 21f, 4.75736f, 21f, 3.87868f, 20.1213f)
        curveTo(3f, 19.2426f, 3f, 17.8284f, 3f, 15f)
        verticalLineTo(13.1213f)
        curveTo(3f, 10.2929f, 3f, 8.87868f, 3.87868f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        lineTo(12.8181f, 8.35982f)
        curveTo(12.2013f, 9.06938f, 11.8929f, 9.42416f, 12.0336f, 9.71208f)
        curveTo(12.1743f, 10f, 12.656f, 10f, 13.6193f, 10f)
        horizontalLineTo(14.3807f)
        curveTo(15.344f, 10f, 15.8257f, 10f, 15.9664f, 10.2879f)
        curveTo(16.1071f, 10.5758f, 15.7987f, 10.9306f, 15.1819f, 11.6402f)
        lineTo(14f, 13f)
        }
        }.build()

        return _electricityStack!!
    }

private var _electricityStack: ImageVector? = null
