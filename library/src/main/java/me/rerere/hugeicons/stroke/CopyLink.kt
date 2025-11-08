package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CopyLink: ImageVector
    get() {
        if (_copyLink != null) {
            return _copyLink!!
        }
        _copyLink = ImageVector.Builder(
            name = "CopyLink",
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
        moveTo(14.5563f, 13.2183f)
        curveTo(13.514f, 14.2606f, 11.8241f, 14.2606f, 10.7817f, 13.2183f)
        curveTo(9.73942f, 12.1759f, 9.73942f, 10.486f, 10.7817f, 9.44364f)
        lineTo(13.1409f, 7.0845f)
        curveTo(14.1357f, 6.08961f, 15.7206f, 6.04433f, 16.7692f, 6.94866f)
        moveTo(16.4437f, 3.78175f)
        curveTo(17.486f, 2.73942f, 19.1759f, 2.73942f, 20.2183f, 3.78175f)
        curveTo(21.2606f, 4.82408f, 21.2606f, 6.51403f, 20.2183f, 7.55636f)
        lineTo(17.8591f, 9.9155f)
        curveTo(16.8643f, 10.9104f, 15.2794f, 10.9557f, 14.2308f, 10.0513f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4999f, 3f)
        curveTo(7.21257f, 3f, 5.56889f, 3f, 4.46256f, 3.9079f)
        curveTo(4.25998f, 4.07414f, 4.07423f, 4.25989f, 3.90798f, 4.46247f)
        curveTo(3.00007f, 5.56879f, 3.00006f, 7.21247f, 3.00002f, 10.4998f)
        lineTo(3f, 12.9999f)
        curveTo(2.99996f, 16.7712f, 2.99995f, 18.6568f, 4.17152f, 19.8284f)
        curveTo(5.3431f, 21f, 7.22873f, 21f, 11f, 21f)
        horizontalLineTo(13.4999f)
        curveTo(16.7874f, 21f, 18.4311f, 21f, 19.5375f, 20.092f)
        curveTo(19.74f, 19.9258f, 19.9257f, 19.7401f, 20.092f, 19.5376f)
        curveTo(20.9999f, 18.4312f, 20.9999f, 16.7875f, 20.9999f, 13.5f)
        }
        }.build()

        return _copyLink!!
    }

private var _copyLink: ImageVector? = null
