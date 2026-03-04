package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailUpload01: ImageVector
    get() {
        if (_mailUpload01 != null) {
            return _mailUpload01!!
        }
        _mailUpload01 = ImageVector.Builder(
            name = "MailUpload01",
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
        moveTo(13.5f, 19.4902f)
        curveTo(12.0328f, 19.5093f, 10.5713f, 19.5004f, 9.09883f, 19.4634f)
        curveTo(5.95033f, 19.3843f, 4.37608f, 19.3448f, 3.24496f, 18.2093f)
        curveTo(2.11383f, 17.0739f, 2.08114f, 15.5411f, 2.01577f, 12.4756f)
        curveTo(1.99475f, 11.4899f, 1.99474f, 10.51f, 2.01576f, 9.52435f)
        curveTo(2.08114f, 6.45882f, 2.11382f, 4.92605f, 3.24495f, 3.79062f)
        curveTo(4.37608f, 2.65518f, 5.95033f, 2.61563f, 9.09882f, 2.53653f)
        curveTo(11.0393f, 2.48778f, 12.9607f, 2.48778f, 14.9012f, 2.53654f)
        curveTo(18.0497f, 2.61565f, 19.6239f, 2.6552f, 20.7551f, 3.79063f)
        curveTo(21.8862f, 4.92606f, 21.9189f, 6.45883f, 21.9842f, 9.52436f)
        curveTo(21.9947f, 10.0172f, 22f, 10.5086f, 22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 5f)
        lineTo(8.91302f, 8.92462f)
        curveTo(11.4387f, 10.3585f, 12.5613f, 10.3585f, 15.087f, 8.92462f)
        lineTo(22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        curveTo(16.4915f, 15.4943f, 17.7998f, 13.5f, 18.5f, 13.5f)
        moveTo(21f, 16f)
        curveTo(20.5085f, 15.4943f, 19.2002f, 13.5f, 18.5f, 13.5f)
        moveTo(18.5f, 13.5f)
        verticalLineTo(21.5f)
        }
        }.build()

        return _mailUpload01!!
    }

private var _mailUpload01: ImageVector? = null
