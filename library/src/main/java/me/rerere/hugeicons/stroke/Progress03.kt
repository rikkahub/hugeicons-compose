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

val HugeIcons.Progress03: ImageVector
    get() {
        if (_progress03 != null) {
            return _progress03!!
        }
        _progress03 = ImageVector.Builder(
            name = "Progress03",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 4.5f)
            curveTo(13.9891f, 4.5f, 15.8968f, 5.29018f, 17.3033f, 6.6967f)
            curveTo(18.7098f, 8.10322f, 19.5f, 10.0109f, 19.5f, 12f)
            curveTo(19.5f, 13.9891f, 18.7098f, 15.8968f, 17.3033f, 17.3033f)
            curveTo(15.8968f, 18.7098f, 13.9891f, 19.5f, 12f, 19.5f)
            lineTo(12f, 4.5f)
            close()
        }
        }.build()

        return _progress03!!
    }

private var _progress03: ImageVector? = null
