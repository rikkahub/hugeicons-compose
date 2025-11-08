package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TwitterSquare: ImageVector
    get() {
        if (_twitterSquare != null) {
            return _twitterSquare!!
        }
        _twitterSquare = ImageVector.Builder(
            name = "TwitterSquare",
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
        moveTo(14.4f, 7f)
        curveTo(13.0745f, 7f, 12f, 8.11929f, 12f, 9.5f)
        curveTo(12f, 9.71132f, 12.0252f, 9.91652f, 12.0726f, 10.1125f)
        curveTo(11.9494f, 10.1208f, 11.8252f, 10.125f, 11.7f, 10.125f)
        curveTo(9.67943f, 10.125f, 7.90441f, 8.71734f, 6.89216f, 7.06577f)
        curveTo(6.70202f, 7.73853f, 6.6f, 8.4506f, 6.6f, 9.1875f)
        curveTo(6.6f, 11.2539f, 7.40225f, 13.4376f, 8.7f, 14.7941f)
        curveTo(8.7f, 15.5294f, 6.9f, 15.9021f, 6f, 15.9966f)
        curveTo(7.05902f, 16.6348f, 8.28857f, 17f, 9.6f, 17f)
        curveTo(13.4885f, 17f, 16.657f, 13.7891f, 16.7953f, 9.77373f)
        lineTo(18f, 7.3125f)
        lineTo(15.9875f, 7.625f)
        curveTo(15.5644f, 7.23602f, 15.0087f, 7f, 14.4f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _twitterSquare!!
    }

private var _twitterSquare: ImageVector? = null
