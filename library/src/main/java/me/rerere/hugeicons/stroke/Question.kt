package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = ImageVector.Builder(
            name = "Question",
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
        moveTo(22f, 7.28342f)
        curveTo(22f, 9.92499f, 19.7611f, 12.0668f, 17f, 12.0668f)
        curveTo(16.6753f, 12.0672f, 16.3516f, 12.0372f, 16.0327f, 11.9773f)
        curveTo(15.8031f, 11.9342f, 15.6883f, 11.9127f, 15.6082f, 11.9249f)
        curveTo(15.5281f, 11.9371f, 15.4145f, 11.9975f, 15.1874f, 12.1183f)
        curveTo(14.545f, 12.4599f, 13.7959f, 12.5806f, 13.0755f, 12.4466f)
        curveTo(13.3493f, 12.1098f, 13.5363f, 11.7057f, 13.6188f, 11.2725f)
        curveTo(13.6688f, 11.0075f, 13.545f, 10.7501f, 13.3594f, 10.5617f)
        curveTo(12.5166f, 9.70583f, 12f, 8.5526f, 12f, 7.28342f)
        curveTo(12f, 4.64184f, 14.2388f, 2.50006f, 17f, 2.50006f)
        curveTo(19.7611f, 2.50006f, 22f, 4.64184f, 22f, 7.28342f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4922f, 7.5f)
        horizontalLineTo(15.5003f)
        moveTo(18.4922f, 7.5f)
        horizontalLineTo(18.5003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50189f, 21.5001f)
        horizontalLineTo(4.71817f)
        curveTo(4.39488f, 21.5001f, 4.07021f, 21.4546f, 3.77327f, 21.327f)
        curveTo(2.80666f, 20.9117f, 2.31624f, 20.3633f, 2.08769f, 20.0202f)
        curveTo(1.95764f, 19.8251f, 1.97617f, 19.5764f, 2.11726f, 19.389f)
        curveTo(3.23716f, 17.9015f, 5.83846f, 17.0031f, 7.50665f, 17.003f)
        curveTo(9.17484f, 17.0031f, 11.7714f, 17.9015f, 12.8913f, 19.389f)
        curveTo(13.0324f, 19.5764f, 13.0509f, 19.8251f, 12.9209f, 20.0202f)
        curveTo(12.6923f, 20.3633f, 12.2019f, 20.9117f, 11.2353f, 21.327f)
        curveTo(10.9383f, 21.4546f, 10.6137f, 21.5001f, 10.2904f, 21.5001f)
        horizontalLineTo(7.50189f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.2854f, 11.7889f)
        curveTo(10.2854f, 13.3202f, 9.04129f, 14.5616f, 7.50664f, 14.5616f)
        curveTo(5.97199f, 14.5616f, 4.72791f, 13.3202f, 4.72791f, 11.7889f)
        curveTo(4.72791f, 10.2576f, 5.97199f, 9.01624f, 7.50664f, 9.01624f)
        curveTo(9.04129f, 9.01624f, 10.2854f, 10.2576f, 10.2854f, 11.7889f)
        }
        }.build()

        return _question!!
    }

private var _question: ImageVector? = null
