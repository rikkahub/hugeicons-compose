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

val HugeIcons.LeafyGreen: ImageVector
    get() {
        if (_leafyGreen != null) {
            return _leafyGreen!!
        }
        _leafyGreen = ImageVector.Builder(
            name = "LeafyGreen",
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
            moveTo(3.94906f, 20.051f)
            lineTo(3f, 21f)
            moveTo(3.94906f, 20.051f)
            curveTo(5.52151f, 18.4785f, 8.07096f, 18.4785f, 9.64341f, 20.051f)
            curveTo(10.8664f, 21.274f, 12.8493f, 21.274f, 14.0723f, 20.051f)
            curveTo(14.6519f, 19.4714f, 14.9559f, 18.7211f, 14.9862f, 17.962f)
            curveTo(16.0741f, 18.3212f, 17.3195f, 18.0692f, 18.1849f, 17.2038f)
            curveTo(19.1704f, 16.2184f, 19.3615f, 14.7398f, 18.7589f, 13.5627f)
            curveTo(19.2436f, 13.4195f, 19.7006f, 13.1574f, 20.083f, 12.775f)
            curveTo(21.3061f, 11.552f, 21.3054f, 9.56849f, 20.0824f, 8.34549f)
            curveTo(21.2833f, 7.12081f, 21.2764f, 5.15506f, 20.0608f, 3.93949f)
            curveTo(18.8452f, 2.72392f, 16.8788f, 2.71643f, 15.6541f, 3.91725f)
            curveTo(14.4311f, 2.69425f, 12.4482f, 2.69425f, 11.2252f, 3.91725f)
            curveTo(10.8428f, 4.29961f, 10.58f, 4.75625f, 10.4368f, 5.24072f)
            curveTo(9.25978f, 4.63862f, 7.78146f, 4.83012f, 6.79623f, 5.81533f)
            curveTo(5.93105f, 6.6805f, 5.67858f, 7.92572f, 6.03748f, 9.0134f)
            curveTo(5.27852f, 9.04379f, 4.5285f, 9.34841f, 3.94906f, 9.92785f)
            curveTo(2.72604f, 11.1508f, 2.72604f, 13.1337f, 3.94906f, 14.3567f)
            curveTo(5.52151f, 15.9291f, 5.52151f, 18.4785f, 3.94906f, 20.051f)
            close()
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
            moveTo(5f, 19f)
            lineTo(15f, 9f)
        }
        }.build()

        return _leafyGreen!!
    }

private var _leafyGreen: ImageVector? = null
