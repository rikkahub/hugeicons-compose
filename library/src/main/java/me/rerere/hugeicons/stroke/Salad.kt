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

val HugeIcons.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = ImageVector.Builder(
            name = "Salad",
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
            moveTo(20.3872f, 6.57272f)
            curveTo(21.1892f, 5.75419f, 21.1846f, 4.44036f, 20.3728f, 3.62792f)
            curveTo(19.5609f, 2.81548f, 18.2477f, 2.81047f, 17.4298f, 3.61305f)
            curveTo(16.613f, 2.79565f, 15.2887f, 2.79565f, 14.4719f, 3.61305f)
            curveTo(14.2166f, 3.86861f, 14.0411f, 4.17381f, 13.9454f, 4.49761f)
            curveTo(13.1593f, 4.09519f, 12.172f, 4.22318f, 11.5141f, 4.88166f)
            curveTo(10.9363f, 5.45991f, 10.7676f, 6.29216f, 11.0073f, 7.01913f)
            curveTo(10.5005f, 7.03944f, 9.99957f, 7.24304f, 9.61259f, 7.63031f)
            curveTo(8.7958f, 8.44771f, 8.7958f, 9.77299f, 9.61259f, 10.5904f)
            curveTo(10.2671f, 11.2454f, 10.5137f, 12.1539f, 10.3524f, 13f)
            horizontalLineTo(18.3f)
            curveTo(18.5997f, 12.9008f, 18.8815f, 12.732f, 19.12f, 12.4933f)
            curveTo(19.7781f, 11.8347f, 19.9057f, 10.8465f, 19.5033f, 10.0597f)
            curveTo(19.827f, 9.964f, 20.1322f, 9.78884f, 20.3876f, 9.53322f)
            curveTo(21.2044f, 8.71581f, 21.204f, 7.39013f, 20.3872f, 6.57272f)
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
            moveTo(17f, 7f)
            lineTo(11f, 13f)
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
            moveTo(13.8889f, 21f)
            horizontalLineTo(10.1111f)
            curveTo(6.18375f, 21f, 3f, 17.8162f, 3f, 13.8889f)
            curveTo(3f, 13.398f, 3.39797f, 13f, 3.88889f, 13f)
            horizontalLineTo(20.1111f)
            curveTo(20.602f, 13f, 21f, 13.398f, 21f, 13.8889f)
            curveTo(21f, 17.8162f, 17.8162f, 21f, 13.8889f, 21f)
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
            moveTo(5.67133f, 13f)
            curveTo(4.65183f, 12.175f, 4f, 10.9136f, 4f, 9.5f)
            curveTo(4f, 7.01472f, 6.01472f, 5f, 8.5f, 5f)
            curveTo(9.42507f, 5f, 10.285f, 5.27914f, 11f, 5.75777f)
        }
        }.build()

        return _salad!!
    }

private var _salad: ImageVector? = null
