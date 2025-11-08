package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VirtualRealityVr02: ImageVector
    get() {
        if (_virtualRealityVr02 != null) {
            return _virtualRealityVr02!!
        }
        _virtualRealityVr02 = ImageVector.Builder(
            name = "VirtualRealityVr02",
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
        horizontalLineTo(11f)
        curveTo(6.75736f, 3f, 4.63604f, 3f, 3.31802f, 4.31802f)
        curveTo(2f, 5.63604f, 2f, 7.75736f, 2f, 12f)
        curveTo(2f, 16.2426f, 2f, 18.364f, 3.31802f, 19.682f)
        curveTo(4.63604f, 21f, 6.75736f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(17.2426f, 21f, 19.364f, 21f, 20.682f, 19.682f)
        curveTo(22f, 18.364f, 22f, 16.2426f, 22f, 12f)
        curveTo(22f, 7.75736f, 22f, 5.63604f, 20.682f, 4.31802f)
        curveTo(19.364f, 3f, 17.2426f, 3f, 13f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 10f)
        lineTo(9.24536f, 13.9123f)
        curveTo(8.92013f, 14.6374f, 8.75751f, 15f, 8.5f, 15f)
        curveTo(8.24249f, 15f, 8.07987f, 14.6374f, 7.75464f, 13.9123f)
        lineTo(6f, 10f)
        moveTo(14f, 15f)
        verticalLineTo(13f)
        moveTo(14f, 13f)
        verticalLineTo(11f)
        curveTo(14f, 10.5286f, 14f, 10.2929f, 14.1464f, 10.1464f)
        curveTo(14.2929f, 10f, 14.5286f, 10f, 15f, 10f)
        horizontalLineTo(16.5f)
        curveTo(17.3284f, 10f, 18f, 10.6716f, 18f, 11.5f)
        curveTo(18f, 12.3284f, 17.3284f, 13f, 16.5f, 13f)
        moveTo(14f, 13f)
        horizontalLineTo(16.5f)
        moveTo(16.5f, 13f)
        lineTo(17.5f, 15f)
        }
        }.build()

        return _virtualRealityVr02!!
    }

private var _virtualRealityVr02: ImageVector? = null
