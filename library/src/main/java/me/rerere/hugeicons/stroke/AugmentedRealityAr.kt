package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AugmentedRealityAr: ImageVector
    get() {
        if (_augmentedRealityAr != null) {
            return _augmentedRealityAr!!
        }
        _augmentedRealityAr = ImageVector.Builder(
            name = "AugmentedRealityAr",
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
        moveTo(6f, 14f)
        lineTo(7.75464f, 10.0877f)
        curveTo(8.07987f, 9.36258f, 8.24249f, 9f, 8.5f, 9f)
        curveTo(8.75751f, 9f, 8.92013f, 9.36258f, 9.24536f, 10.0877f)
        lineTo(11f, 14f)
        moveTo(14f, 14f)
        verticalLineTo(12f)
        moveTo(14f, 12f)
        verticalLineTo(10.2f)
        curveTo(14f, 9.63431f, 14f, 9.35147f, 14.1757f, 9.17574f)
        curveTo(14.3515f, 9f, 14.6343f, 9f, 15.2f, 9f)
        horizontalLineTo(16.5f)
        curveTo(17.3284f, 9f, 18f, 9.67157f, 18f, 10.5f)
        curveTo(18f, 11.3284f, 17.3284f, 12f, 16.5f, 12f)
        moveTo(14f, 12f)
        horizontalLineTo(16.5f)
        moveTo(16.5f, 12f)
        lineTo(17.5f, 14f)
        }
        }.build()

        return _augmentedRealityAr!!
    }

private var _augmentedRealityAr: ImageVector? = null
