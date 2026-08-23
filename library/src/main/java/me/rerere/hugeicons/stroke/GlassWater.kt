package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GlassWater: ImageVector
    get() {
        if (_glassWater != null) {
            return _glassWater!!
        }
        _glassWater = ImageVector.Builder(
            name = "GlassWater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.3491f, 2f)
            horizontalLineTo(9.65087f)
            curveTo(7.63077f, 2f, 6.62072f, 2f, 6.01552f, 2.62155f)
            curveTo(5.41033f, 3.2431f, 5.46077f, 4.22865f, 5.56165f, 6.19976f)
            lineTo(6.08916f, 16.5069f)
            curveTo(6.21695f, 19.0038f, 6.28085f, 20.2522f, 7.05519f, 21.0561f)
            curveTo(7.13278f, 21.1366f, 7.21487f, 21.2129f, 7.30109f, 21.2846f)
            curveTo(8.1615f, 22f, 9.441f, 22f, 12f, 22f)
            curveTo(14.559f, 22f, 15.8385f, 22f, 16.6989f, 21.2846f)
            curveTo(16.7851f, 21.2129f, 16.8672f, 21.1366f, 16.9448f, 21.0561f)
            curveTo(17.7192f, 20.2522f, 17.783f, 19.0038f, 17.9108f, 16.5069f)
            lineTo(18.4383f, 6.19975f)
            curveTo(18.5392f, 4.22865f, 18.5897f, 3.2431f, 17.9845f, 2.62155f)
            curveTo(17.3793f, 2f, 16.3692f, 2f, 14.3491f, 2f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 9f)
            curveTo(6.86548f, 8.35089f, 7.91815f, 8f, 9f, 8f)
            curveTo(10.0819f, 8f, 11.1345f, 8.35089f, 12f, 9f)
            curveTo(12.8655f, 9.64911f, 13.9181f, 10f, 15f, 10f)
            curveTo(16.0819f, 10f, 17.1345f, 9.64911f, 18f, 9f)
        }
        }.build()

        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
