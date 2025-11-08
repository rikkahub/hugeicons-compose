package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = ImageVector.Builder(
            name = "Bowling",
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
        moveTo(10.5638f, 6.56062f)
        lineTo(10.1822f, 4.45142f)
        curveTo(9.95278f, 3.18322f, 10.8302f, 2f, 12f, 2f)
        curveTo(13.1698f, 2f, 14.0472f, 3.18322f, 13.8178f, 4.45142f)
        lineTo(13.4362f, 6.56062f)
        curveTo(12.8624f, 9.73293f, 14.4246f, 11.6357f, 15.5111f, 14.2704f)
        curveTo(15.9844f, 15.4182f, 16.1184f, 16.7017f, 15.8941f, 17.9385f)
        curveTo(15.702f, 18.998f, 15.3996f, 20.6686f, 14.7603f, 21.4829f)
        curveTo(14.3324f, 22.0281f, 13.7247f, 21.9997f, 13.1202f, 21.9997f)
        horizontalLineTo(10.8798f)
        curveTo(10.2753f, 21.9997f, 9.66764f, 22.0281f, 9.2397f, 21.4829f)
        curveTo(8.60041f, 20.6686f, 8.29796f, 18.998f, 8.10586f, 17.9385f)
        curveTo(7.88161f, 16.7017f, 8.01565f, 15.4182f, 8.48894f, 14.2704f)
        curveTo(9.57541f, 11.6357f, 11.1376f, 9.73293f, 10.5638f, 6.56062f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.9998f)
        horizontalLineTo(19.2945f)
        curveTo(19.8625f, 19.9998f, 20.4333f, 20.0225f, 20.8354f, 19.5863f)
        curveTo(21.4354f, 18.9354f, 21.7196f, 17.6008f, 21.9001f, 16.7531f)
        lineTo(21.9005f, 16.7508f)
        curveTo(22.1112f, 15.7614f, 21.9853f, 14.7346f, 21.5407f, 13.8164f)
        curveTo(20.52f, 11.7085f, 19.0523f, 10.1863f, 19.5914f, 7.64849f)
        lineTo(19.9499f, 5.96114f)
        curveTo(20.1654f, 4.94657f, 19.3412f, 4f, 18.2422f, 4f)
        curveTo(17.1432f, 4f, 16.3189f, 4.94657f, 16.5344f, 5.96114f)
        lineTo(16.8929f, 7.64849f)
        curveTo(17.0992f, 8.6198f, 17.0116f, 9.44233f, 16.7676f, 10.2059f)
        moveTo(16.9677f, 9.33333f)
        horizontalLineTo(19.5176f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19.9998f)
        horizontalLineTo(4.70545f)
        curveTo(4.13752f, 19.9998f, 3.56668f, 20.0225f, 3.16465f, 19.5863f)
        curveTo(2.56461f, 18.9354f, 2.28044f, 17.6008f, 2.09994f, 16.7531f)
        lineTo(2.09945f, 16.7508f)
        curveTo(1.88877f, 15.7614f, 2.0147f, 14.7346f, 2.45934f, 13.8164f)
        curveTo(3.48003f, 11.7085f, 4.94769f, 10.1863f, 4.40855f, 7.64849f)
        lineTo(4.05009f, 5.96114f)
        curveTo(3.83456f, 4.94657f, 4.65883f, 4f, 5.75784f, 4f)
        curveTo(6.85685f, 4f, 7.68112f, 4.94657f, 7.46559f, 5.96114f)
        lineTo(7.10713f, 7.64849f)
        curveTo(6.90078f, 8.6198f, 6.98839f, 9.44233f, 7.2324f, 10.2059f)
        moveTo(7.03228f, 9.33333f)
        horizontalLineTo(4.48242f)
        }
        }.build()

        return _bowling!!
    }

private var _bowling: ImageVector? = null
