package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = ImageVector.Builder(
            name = "ThumbsUp",
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
        moveTo(2f, 12.5f)
        curveTo(2f, 11.3954f, 2.89543f, 10.5f, 4f, 10.5f)
        curveTo(5.65685f, 10.5f, 7f, 11.8431f, 7f, 13.5f)
        verticalLineTo(17.5f)
        curveTo(7f, 19.1569f, 5.65685f, 20.5f, 4f, 20.5f)
        curveTo(2.89543f, 20.5f, 2f, 19.6046f, 2f, 18.5f)
        verticalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4787f, 7.80626f)
        lineTo(15.2124f, 8.66634f)
        curveTo(14.9942f, 9.37111f, 14.8851f, 9.72349f, 14.969f, 10.0018f)
        curveTo(15.0369f, 10.2269f, 15.1859f, 10.421f, 15.389f, 10.5487f)
        curveTo(15.64f, 10.7065f, 16.0197f, 10.7065f, 16.7791f, 10.7065f)
        horizontalLineTo(17.1831f)
        curveTo(19.7532f, 10.7065f, 21.0382f, 10.7065f, 21.6452f, 11.4673f)
        curveTo(21.7145f, 11.5542f, 21.7762f, 11.6467f, 21.8296f, 11.7437f)
        curveTo(22.2965f, 12.5921f, 21.7657f, 13.7351f, 20.704f, 16.0211f)
        curveTo(19.7297f, 18.1189f, 19.2425f, 19.1678f, 18.338f, 19.7852f)
        curveTo(18.2505f, 19.8449f, 18.1605f, 19.9013f, 18.0683f, 19.9541f)
        curveTo(17.116f, 20.5f, 15.9362f, 20.5f, 13.5764f, 20.5f)
        horizontalLineTo(13.0646f)
        curveTo(10.2057f, 20.5f, 8.77628f, 20.5f, 7.88814f, 19.6395f)
        curveTo(7f, 18.7789f, 7f, 17.3939f, 7f, 14.6239f)
        verticalLineTo(13.6503f)
        curveTo(7f, 12.1946f, 7f, 11.4668f, 7.25834f, 10.8006f)
        curveTo(7.51668f, 10.1344f, 8.01135f, 9.58664f, 9.00069f, 8.49112f)
        lineTo(13.0921f, 3.96056f)
        curveTo(13.1947f, 3.84694f, 13.246f, 3.79012f, 13.2913f, 3.75075f)
        curveTo(13.7135f, 3.38328f, 14.3652f, 3.42464f, 14.7344f, 3.84235f)
        curveTo(14.774f, 3.8871f, 14.8172f, 3.94991f, 14.9036f, 4.07554f)
        curveTo(15.0388f, 4.27205f, 15.1064f, 4.37031f, 15.1654f, 4.46765f)
        curveTo(15.6928f, 5.33913f, 15.8524f, 6.37436f, 15.6108f, 7.35715f)
        curveTo(15.5838f, 7.46692f, 15.5488f, 7.5801f, 15.4787f, 7.80626f)
        }
        }.build()

        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
