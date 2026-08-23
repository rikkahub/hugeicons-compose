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

val HugeIcons.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) {
            return _cakeSlice!!
        }
        _cakeSlice = ImageVector.Builder(
            name = "CakeSlice",
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
            moveTo(10f, 7f)
            arcTo(2f, 2f, 0f, true, false, 6f, 7f)
            arcTo(2f, 2f, 0f, true, false, 10f, 7f)
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
            moveTo(9f, 3f)
            curveTo(8.66667f, 3.33333f, 8f, 4.2f, 8f, 5f)
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
            moveTo(9.65116f, 5.64027f)
            curveTo(10.8211f, 4.76044f, 11.9459f, 3.95939f, 12.8779f, 3.37428f)
            curveTo(13.2809f, 3.12129f, 13.7503f, 3f, 14.2261f, 3f)
            curveTo(14.7321f, 3f, 15.2316f, 3.13556f, 15.6454f, 3.42683f)
            curveTo(17.8484f, 4.97772f, 21f, 8.09848f, 21f, 11f)
            verticalLineTo(15f)
            curveTo(21f, 17.8284f, 21f, 19.2426f, 20.1213f, 20.1213f)
            curveTo(19.2426f, 21f, 17.8284f, 21f, 15f, 21f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 21f, 4.75736f, 21f, 3.87868f, 20.1213f)
            curveTo(3f, 19.2426f, 3f, 17.8284f, 3f, 15f)
            verticalLineTo(13.7596f)
            curveTo(3f, 12.394f, 3f, 11.7112f, 3.28716f, 11.103f)
            curveTo(3.57431f, 10.4948f, 4.08774f, 10.0722f, 5.11459f, 9.22717f)
            curveTo(5.50527f, 8.90565f, 5.91755f, 8.56939f, 6.34336f, 8.22585f)
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
            moveTo(3f, 17f)
            curveTo(3.54f, 17.25f, 4.08f, 17.5f, 5.25f, 17.5f)
            curveTo(7.5f, 17.5f, 7.5f, 16.5f, 9.75f, 16.5f)
            curveTo(12.09f, 16.5f, 11.91f, 17.5f, 14.25f, 17.5f)
            curveTo(16.5f, 17.5f, 16.5f, 16.5f, 18.75f, 16.5f)
            curveTo(19.92f, 16.5f, 20.46f, 16.75f, 21f, 17f)
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
            moveTo(3f, 13f)
            horizontalLineTo(21f)
        }
        }.build()

        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
