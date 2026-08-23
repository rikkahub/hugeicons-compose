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

val HugeIcons.VenetianMask: ImageVector
    get() {
        if (_venetianMask != null) {
            return _venetianMask!!
        }
        _venetianMask = ImageVector.Builder(
            name = "VenetianMask",
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
            moveTo(18f, 11f)
            curveTo(17f, 11f, 15.5f, 11.5f, 15f, 13f)
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
            moveTo(6f, 11f)
            curveTo(7f, 11f, 8.5f, 11.5f, 9f, 13f)
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
            moveTo(17.7639f, 7f)
            curveTo(19.0061f, 7f, 20.1516f, 6.36389f, 20.8115f, 5.33205f)
            curveTo(20.9377f, 5.13484f, 21.1479f, 5f, 21.382f, 5f)
            curveTo(21.7233f, 5f, 22f, 5.2767f, 22f, 5.61803f)
            verticalLineTo(11f)
            curveTo(22f, 14.3137f, 19.3137f, 17f, 16f, 17f)
            curveTo(14.8423f, 17f, 13.7346f, 17.4087f, 12.7938f, 18.5954f)
            curveTo(12.5997f, 18.8402f, 12.3124f, 19f, 12f, 19f)
            curveTo(11.6876f, 19f, 11.4003f, 18.8402f, 11.2062f, 18.5954f)
            curveTo(10.2654f, 17.4087f, 9.15771f, 17f, 8f, 17f)
            curveTo(4.68629f, 17f, 2f, 14.3137f, 2f, 11f)
            verticalLineTo(5.61803f)
            curveTo(2f, 5.2767f, 2.2767f, 5f, 2.61803f, 5f)
            curveTo(2.85213f, 5f, 3.06235f, 5.13484f, 3.18848f, 5.33205f)
            curveTo(3.84841f, 6.36389f, 4.99393f, 7f, 6.23607f, 7f)
            horizontalLineTo(8.26393f)
            curveTo(9.46609f, 7f, 10.5777f, 7.59582f, 11.2463f, 8.56956f)
            curveTo(11.4197f, 8.82218f, 11.6936f, 9f, 12f, 9f)
            curveTo(12.3064f, 9f, 12.5803f, 8.82218f, 12.7537f, 8.56956f)
            curveTo(13.4223f, 7.59582f, 14.5339f, 7f, 15.7361f, 7f)
            horizontalLineTo(17.7639f)
            close()
        }
        }.build()

        return _venetianMask!!
    }

private var _venetianMask: ImageVector? = null
