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

val HugeIcons.Repost: ImageVector
    get() {
        if (_repost != null) {
            return _repost!!
        }
        _repost = ImageVector.Builder(
            name = "Repost",
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
            moveTo(8f, 18.5f)
            horizontalLineTo(12.5f)
            curveTo(15.7875f, 18.5f, 17.4312f, 18.5f, 18.5376f, 17.592f)
            curveTo(18.7401f, 17.4258f, 18.9258f, 17.2401f, 19.092f, 17.0376f)
            curveTo(20f, 15.9312f, 20f, 14.2875f, 20f, 11f)
            moveTo(16f, 5.5f)
            horizontalLineTo(11.5f)
            curveTo(8.21252f, 5.5f, 6.56878f, 5.5f, 5.46243f, 6.40796f)
            curveTo(5.25989f, 6.57418f, 5.07418f, 6.75989f, 4.90796f, 6.96243f)
            curveTo(4f, 8.06878f, 4f, 9.71252f, 4f, 13f)
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
            moveTo(13.5f, 2f)
            curveTo(13.5f, 2f, 17f, 4.57771f, 17f, 5.50003f)
            curveTo(17f, 6.42234f, 13.5f, 9f, 13.5f, 9f)
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
            moveTo(10.5f, 15f)
            curveTo(10.5f, 15f, 7.00001f, 17.5777f, 7f, 18.5f)
            curveTo(6.99999f, 19.4223f, 10.5f, 22f, 10.5f, 22f)
        }
        }.build()

        return _repost!!
    }

private var _repost: ImageVector? = null
