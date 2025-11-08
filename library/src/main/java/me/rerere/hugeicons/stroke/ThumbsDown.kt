package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = ImageVector.Builder(
            name = "ThumbsDown",
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
        moveTo(2f, 11.5f)
        curveTo(2f, 12.6046f, 2.89543f, 13.5f, 4f, 13.5f)
        curveTo(5.65685f, 13.5f, 7f, 12.1569f, 7f, 10.5f)
        verticalLineTo(6.5f)
        curveTo(7f, 4.84315f, 5.65685f, 3.5f, 4f, 3.5f)
        curveTo(2.89543f, 3.5f, 2f, 4.39543f, 2f, 5.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4787f, 16.1937f)
        lineTo(15.2124f, 15.3337f)
        curveTo(14.9942f, 14.6289f, 14.8851f, 14.2765f, 14.969f, 13.9982f)
        curveTo(15.0369f, 13.7731f, 15.1859f, 13.579f, 15.389f, 13.4513f)
        curveTo(15.64f, 13.2935f, 16.0197f, 13.2935f, 16.7791f, 13.2935f)
        horizontalLineTo(17.1831f)
        curveTo(19.7532f, 13.2935f, 21.0382f, 13.2935f, 21.6452f, 12.5327f)
        curveTo(21.7145f, 12.4458f, 21.7762f, 12.3533f, 21.8296f, 12.2563f)
        curveTo(22.2965f, 11.4079f, 21.7657f, 10.2649f, 20.704f, 7.9789f)
        curveTo(19.7297f, 5.88111f, 19.2425f, 4.83222f, 18.338f, 4.21485f)
        curveTo(18.2505f, 4.15508f, 18.1605f, 4.0987f, 18.0683f, 4.04586f)
        curveTo(17.116f, 3.5f, 15.9362f, 3.5f, 13.5764f, 3.5f)
        horizontalLineTo(13.0646f)
        curveTo(10.2057f, 3.5f, 8.77628f, 3.5f, 7.88814f, 4.36053f)
        curveTo(7f, 5.22106f, 7f, 6.60607f, 7f, 9.37607f)
        verticalLineTo(10.3497f)
        curveTo(7f, 11.8054f, 7f, 12.5332f, 7.25834f, 13.1994f)
        curveTo(7.51668f, 13.8656f, 8.01135f, 14.4134f, 9.00069f, 15.5089f)
        lineTo(13.0921f, 20.0394f)
        curveTo(13.1947f, 20.1531f, 13.246f, 20.2099f, 13.2913f, 20.2493f)
        curveTo(13.7135f, 20.6167f, 14.3652f, 20.5754f, 14.7344f, 20.1577f)
        curveTo(14.774f, 20.1129f, 14.8172f, 20.0501f, 14.9036f, 19.9245f)
        curveTo(15.0388f, 19.728f, 15.1064f, 19.6297f, 15.1654f, 19.5323f)
        curveTo(15.6928f, 18.6609f, 15.8524f, 17.6256f, 15.6108f, 16.6429f)
        curveTo(15.5838f, 16.5331f, 15.5488f, 16.4199f, 15.4787f, 16.1937f)
        }
        }.build()

        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
