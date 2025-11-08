package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tumblr: ImageVector
    get() {
        if (_tumblr != null) {
            return _tumblr!!
        }
        _tumblr = ImageVector.Builder(
            name = "Tumblr",
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
        moveTo(7.90012f, 11.0183f)
        horizontalLineTo(7.01078f)
        curveTo(6.17867f, 11.0183f, 5.99989f, 10.8498f, 6f, 10.0181f)
        lineTo(6.00024f, 8.26617f)
        curveTo(6.00033f, 7.61097f, 5.98766f, 7.61186f, 6.65257f, 7.29099f)
        curveTo(8.35896f, 6.46753f, 9.86003f, 4.88315f, 10.2616f, 2.99294f)
        curveTo(10.3706f, 2.48002f, 10.4251f, 2.22356f, 10.5643f, 2.11178f)
        curveTo(10.7035f, 2f, 10.9282f, 2f, 11.3775f, 2f)
        horizontalLineTo(12.7521f)
        curveTo(13.2286f, 2f, 13.4668f, 2f, 13.6148f, 2.14645f)
        curveTo(13.7629f, 2.29289f, 13.7629f, 2.5286f, 13.7629f, 3f)
        verticalLineTo(6.56483f)
        curveTo(13.7629f, 7.39637f, 13.9416f, 7.56483f, 14.7736f, 7.56483f)
        horizontalLineTo(16.6332f)
        curveTo(17.4653f, 7.56483f, 17.6441f, 7.73332f, 17.644f, 8.56496f)
        lineTo(17.6438f, 10.0184f)
        curveTo(17.6437f, 10.8499f, 17.4649f, 11.0183f, 16.633f, 11.0183f)
        horizontalLineTo(14.7733f)
        curveTo(13.9412f, 11.0183f, 13.7624f, 11.1868f, 13.7625f, 12.0184f)
        lineTo(13.7629f, 16.2597f)
        curveTo(13.7629f, 18.0202f, 15.3229f, 18.6002f, 16.6945f, 17.9926f)
        curveTo(17.1718f, 17.7811f, 17.1788f, 17.7952f, 17.3247f, 18.2389f)
        lineTo(17.9001f, 19.9882f)
        curveTo(18.0893f, 20.5636f, 18.0369f, 20.7786f, 17.5063f, 21.0836f)
        curveTo(13.5744f, 23.3432f, 8.91128f, 21.3694f, 8.91128f, 15.768f)
        lineTo(8.91091f, 12.0182f)
        curveTo(8.91083f, 11.1867f, 8.73205f, 11.0183f, 7.90012f, 11.0183f)
        }
        }.build()

        return _tumblr!!
    }

private var _tumblr: ImageVector? = null
