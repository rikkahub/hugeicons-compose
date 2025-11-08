package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailVoice01: ImageVector
    get() {
        if (_mailVoice01 != null) {
            return _mailVoice01!!
        }
        _mailVoice01 = ImageVector.Builder(
            name = "MailVoice01",
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
        moveTo(2f, 4.5f)
        lineTo(8.91302f, 8.42462f)
        curveTo(11.4387f, 9.85846f, 12.5613f, 9.85846f, 15.087f, 8.42462f)
        lineTo(22f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9982f, 9.99608f)
        curveTo(21.9958f, 9.67139f, 21.9912f, 9.34649f, 21.9842f, 9.02095f)
        curveTo(21.9189f, 5.95692f, 21.8862f, 4.4249f, 20.7551f, 3.29003f)
        curveTo(19.6239f, 2.15515f, 18.0497f, 2.11562f, 14.9012f, 2.03655f)
        curveTo(12.9607f, 1.98782f, 11.0393f, 1.98782f, 9.09882f, 2.03654f)
        curveTo(5.95033f, 2.1156f, 4.37608f, 2.15513f, 3.24495f, 3.29002f)
        curveTo(2.11382f, 4.42489f, 2.08114f, 5.95691f, 2.01576f, 9.02093f)
        curveTo(1.99474f, 10.0062f, 1.99475f, 10.9855f, 2.01577f, 11.9707f)
        curveTo(2.08114f, 15.0348f, 2.11383f, 16.5668f, 3.24496f, 17.7017f)
        curveTo(4.37608f, 18.8365f, 5.95033f, 18.876f, 9.09883f, 18.9551f)
        curveTo(9.90159f, 18.9753f, 10.7011f, 18.9871f, 11.5f, 18.9906f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4863f, 17.9689f)
        curveTo(15.098f, 19.0055f, 16.3263f, 19.9754f, 18.0017f, 19.9754f)
        curveTo(19.6771f, 19.9754f, 20.9102f, 19.0055f, 21.5218f, 17.9689f)
        moveTo(18.0117f, 20.1349f)
        lineTo(18.0117f, 22f)
        moveTo(17.9894f, 17.1191f)
        curveTo(16.9829f, 17.1191f, 16.167f, 16.3036f, 16.167f, 15.2976f)
        verticalLineTo(13.8181f)
        curveTo(16.167f, 12.8121f, 16.9829f, 11.9966f, 17.9894f, 11.9966f)
        curveTo(18.9959f, 11.9966f, 19.8118f, 12.8121f, 19.8118f, 13.8181f)
        verticalLineTo(15.2976f)
        curveTo(19.8118f, 16.3036f, 18.9959f, 17.1191f, 17.9894f, 17.1191f)
        }
        }.build()

        return _mailVoice01!!
    }

private var _mailVoice01: ImageVector? = null
