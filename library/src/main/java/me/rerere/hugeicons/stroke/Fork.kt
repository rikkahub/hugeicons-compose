package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fork: ImageVector
    get() {
        if (_fork != null) {
            return _fork!!
        }
        _fork = ImageVector.Builder(
            name = "Fork",
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
        moveTo(19f, 5f)
        lineTo(15.5f, 8.5f)
        moveTo(13.5f, 6.5f)
        lineTo(17.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 6.68722f)
        lineTo(17.7971f, 10.8898f)
        curveTo(16.9852f, 11.7016f, 15.8891f, 12.1657f, 14.741f, 12.1836f)
        lineTo(14.3982f, 12.1889f)
        curveTo(13.7949f, 12.1983f, 13.2213f, 12.4527f, 12.8093f, 12.8935f)
        lineTo(4.77175f, 21.4921f)
        curveTo(4.15326f, 22.1537f, 3.10957f, 22.1713f, 2.46911f, 21.5309f)
        curveTo(1.82872f, 20.8906f, 1.84625f, 19.8471f, 2.50778f, 19.2287f)
        lineTo(11.106f, 11.1901f)
        curveTo(11.5467f, 10.7781f, 11.8009f, 10.2047f, 11.8103f, 9.60146f)
        lineTo(11.8157f, 9.25855f)
        curveTo(11.8335f, 8.11046f, 12.2976f, 7.01438f, 13.1096f, 6.20246f)
        lineTo(17.3124f, 2f)
        }
        }.build()

        return _fork!!
    }

private var _fork: ImageVector? = null
