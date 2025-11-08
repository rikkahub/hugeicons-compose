package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Colors: ImageVector
    get() {
        if (_colors != null) {
            return _colors!!
        }
        _colors = ImageVector.Builder(
            name = "Colors",
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
        moveTo(17.5798f, 9.71016f)
        curveTo(17.0765f, 9.57314f, 16.5468f, 9.5f, 16f, 9.5f)
        curveTo(13.4668f, 9.5f, 11.3002f, 11.0699f, 10.4202f, 13.2898f)
        moveTo(17.5798f, 9.71016f)
        curveTo(20.1271f, 10.4036f, 22f, 12.7331f, 22f, 15.5f)
        curveTo(22f, 18.8137f, 19.3137f, 21.5f, 16f, 21.5f)
        curveTo(14.4633f, 21.5f, 13.0615f, 20.9223f, 12f, 19.9722f)
        moveTo(17.5798f, 9.71016f)
        curveTo(17.851f, 9.02618f, 18f, 8.2805f, 18f, 7.5f)
        curveTo(18f, 4.18629f, 15.3137f, 1.5f, 12f, 1.5f)
        curveTo(8.68629f, 1.5f, 6f, 4.18629f, 6f, 7.5f)
        curveTo(6f, 8.2805f, 6.14903f, 9.02618f, 6.42018f, 9.71016f)
        moveTo(10.4202f, 13.2898f)
        curveTo(10.149f, 13.9738f, 10f, 14.7195f, 10f, 15.5f)
        curveTo(10f, 17.277f, 10.7725f, 18.8736f, 12f, 19.9722f)
        moveTo(10.4202f, 13.2898f)
        curveTo(8.59146f, 12.792f, 7.11029f, 11.451f, 6.42018f, 9.71016f)
        moveTo(6.42018f, 9.71016f)
        curveTo(3.87294f, 10.4036f, 2f, 12.7331f, 2f, 15.5f)
        curveTo(2f, 18.8137f, 4.68629f, 21.5f, 8f, 21.5f)
        curveTo(9.53671f, 21.5f, 10.9385f, 20.9223f, 12f, 19.9722f)
        }
        }.build()

        return _colors!!
    }

private var _colors: ImageVector? = null
