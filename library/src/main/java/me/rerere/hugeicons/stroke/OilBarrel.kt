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

val HugeIcons.OilBarrel: ImageVector
    get() {
        if (_oilBarrel != null) {
            return _oilBarrel!!
        }
        _oilBarrel = ImageVector.Builder(
            name = "OilBarrel",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 4f)
            arcTo(8f, 2f, 0f, true, false, 4f, 4f)
            arcTo(8f, 2f, 0f, true, false, 20f, 4f)
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
            moveTo(12f, 12.5f)
            curveTo(12.8284f, 12.5f, 13.5f, 11.8284f, 13.5f, 11f)
            curveTo(13.5f, 10f, 12f, 8.5f, 12f, 8.5f)
            curveTo(12f, 8.5f, 10.5f, 10f, 10.5f, 11f)
            curveTo(10.5f, 11.8284f, 11.1716f, 12.5f, 12f, 12.5f)
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
            moveTo(19f, 5f)
            verticalLineTo(10.5465f)
            curveTo(19.6372f, 10.9771f, 20f, 11.4727f, 20f, 12f)
            curveTo(20f, 13.6569f, 16.4183f, 15f, 12f, 15f)
            curveTo(7.58172f, 15f, 4f, 13.6569f, 4f, 12f)
            curveTo(4f, 11.4727f, 4.36284f, 10.9771f, 5f, 10.5465f)
            verticalLineTo(5f)
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
            moveTo(19f, 13.5f)
            verticalLineTo(17.5465f)
            curveTo(19.6372f, 17.9771f, 20f, 18.4727f, 20f, 19f)
            curveTo(20f, 20.6569f, 16.4183f, 22f, 12f, 22f)
            curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
            curveTo(4f, 18.4727f, 4.36284f, 17.9771f, 5f, 17.5465f)
            verticalLineTo(13.5f)
        }
        }.build()

        return _oilBarrel!!
    }

private var _oilBarrel: ImageVector? = null
