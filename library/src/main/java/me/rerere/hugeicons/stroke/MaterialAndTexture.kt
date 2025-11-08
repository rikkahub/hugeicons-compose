package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MaterialAndTexture: ImageVector
    get() {
        if (_materialAndTexture != null) {
            return _materialAndTexture!!
        }
        _materialAndTexture = ImageVector.Builder(
            name = "MaterialAndTexture",
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
        moveTo(17.7705f, 4.99408f)
        lineTo(14.3145f, 3.66279f)
        curveTo(13.1674f, 3.22093f, 12.5939f, 3f, 12.0001f, 3f)
        curveTo(11.4062f, 3f, 10.8327f, 3.22093f, 9.68561f, 3.66279f)
        lineTo(6.22941f, 4.99417f)
        curveTo(4.07647f, 5.82351f, 2.99999f, 6.23818f, 3f, 7.00021f)
        curveTo(3.00001f, 7.76225f, 4.07649f, 8.17688f, 6.22946f, 9.00616f)
        lineTo(9.68542f, 10.3373f)
        curveTo(10.8324f, 10.7791f, 11.4058f, 11f, 11.9996f, 11f)
        curveTo(12.5934f, 11f, 13.1668f, 10.7791f, 14.3138f, 10.3374f)
        lineTo(17.7704f, 9.0061f)
        curveTo(19.9235f, 8.17685f, 21f, 7.76223f, 21f, 7.00018f)
        curveTo(21f, 6.23814f, 19.9235f, 5.82345f, 17.7705f, 4.99408f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 9.50488f)
        lineTo(17.7705f, 9.99429f)
        curveTo(19.9235f, 10.8237f, 21f, 11.2383f, 21f, 12.0004f)
        curveTo(21f, 12.7624f, 19.9235f, 13.1771f, 17.7704f, 14.0063f)
        lineTo(14.3138f, 15.3376f)
        curveTo(13.1668f, 15.7793f, 12.5934f, 16.0002f, 11.9996f, 16.0002f)
        curveTo(11.4058f, 16.0002f, 10.8324f, 15.7793f, 9.68542f, 15.3375f)
        lineTo(6.22946f, 14.0064f)
        curveTo(4.07649f, 13.1771f, 3.00001f, 12.7625f, 3f, 12.0004f)
        curveTo(2.99999f, 11.2384f, 4.07647f, 10.8237f, 6.22941f, 9.99437f)
        lineTo(7.50011f, 9.50488f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 10.5f)
        lineTo(8.76086f, 14.8882f)
        moveTo(5f, 13.5f)
        lineTo(10.5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.6352f, 14.5566f)
        lineTo(17.7705f, 14.9939f)
        curveTo(19.9235f, 15.8233f, 21f, 16.238f, 21f, 17.0001f)
        curveTo(21f, 17.7621f, 19.9235f, 18.1767f, 17.7704f, 19.006f)
        lineTo(14.3138f, 20.3373f)
        curveTo(13.1668f, 20.779f, 12.5934f, 20.9999f, 11.9996f, 20.9999f)
        curveTo(11.4058f, 20.9999f, 10.8324f, 20.779f, 9.68542f, 20.3372f)
        lineTo(6.22946f, 19.006f)
        curveTo(4.07649f, 18.1768f, 3.00001f, 17.7621f, 3f, 17.0001f)
        curveTo(2.99999f, 16.238f, 4.07647f, 15.8234f, 6.22941f, 14.994f)
        lineTo(7.36476f, 14.5567f)
        }
        }.build()

        return _materialAndTexture!!
    }

private var _materialAndTexture: ImageVector? = null
