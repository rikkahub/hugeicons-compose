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

val HugeIcons.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = ImageVector.Builder(
            name = "Sticker",
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
            moveTo(3f, 13f)
            verticalLineTo(11f)
            curveTo(3f, 7.22876f, 3f, 5.34315f, 4.17157f, 4.17157f)
            curveTo(5.34315f, 3f, 7.22876f, 3f, 11f, 3f)
            horizontalLineTo(12.6863f)
            curveTo(14.3213f, 3f, 15.1388f, 3f, 15.8739f, 3.30449f)
            curveTo(16.609f, 3.60897f, 17.1871f, 4.18704f, 18.3432f, 5.34318f)
            lineTo(18.6569f, 5.65686f)
            curveTo(19.813f, 6.81298f, 20.391f, 7.39104f, 20.6955f, 8.12612f)
            curveTo(21f, 8.8612f, 21f, 9.67869f, 21f, 11.3137f)
            verticalLineTo(13f)
            curveTo(21f, 16.7712f, 21f, 18.6569f, 19.8284f, 19.8284f)
            curveTo(18.6569f, 21f, 16.7712f, 21f, 13f, 21f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
            curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
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
            moveTo(15f, 3.5f)
            curveTo(15f, 5.84558f, 15f, 7.01836f, 15.6199f, 7.82628f)
            curveTo(15.7795f, 8.03428f, 15.9657f, 8.22046f, 16.1737f, 8.38006f)
            curveTo(16.9816f, 9f, 18.1544f, 9f, 20.5001f, 9f)
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
            moveTo(14.5f, 16f)
            curveTo(13.8152f, 16.6257f, 12.9459f, 17f, 12f, 17f)
            curveTo(11.0541f, 17f, 10.1848f, 16.6257f, 9.5f, 16f)
            moveTo(8.25f, 12.125f)
            verticalLineTo(12.25f)
            moveTo(15.75f, 12.1257f)
            verticalLineTo(12.2507f)
            moveTo(8.5f, 12.25f)
            curveTo(8.5f, 12.3881f, 8.38807f, 12.5f, 8.25f, 12.5f)
            curveTo(8.11193f, 12.5f, 8f, 12.3881f, 8f, 12.25f)
            curveTo(8f, 12.1119f, 8.11193f, 12f, 8.25f, 12f)
            curveTo(8.38807f, 12f, 8.5f, 12.1119f, 8.5f, 12.25f)
            close()
            moveTo(16f, 12.2507f)
            curveTo(16f, 12.3887f, 15.8881f, 12.5007f, 15.75f, 12.5007f)
            curveTo(15.6119f, 12.5007f, 15.5f, 12.3887f, 15.5f, 12.2507f)
            curveTo(15.5f, 12.1126f, 15.6119f, 12.0007f, 15.75f, 12.0007f)
            curveTo(15.8881f, 12.0007f, 16f, 12.1126f, 16f, 12.2507f)
            close()
        }
        }.build()

        return _sticker!!
    }

private var _sticker: ImageVector? = null
