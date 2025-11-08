package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Acceleration: ImageVector
    get() {
        if (_acceleration != null) {
            return _acceleration!!
        }
        _acceleration = ImageVector.Builder(
            name = "Acceleration",
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
        moveTo(2.49805f, 18.4138f)
        verticalLineTo(11.1909f)
        curveTo(2.49805f, 9.86228f, 2.49805f, 9.19798f, 3.09674f, 9.03265f)
        curveTo(3.69542f, 8.86733f, 4.40002f, 9.33706f, 5.80922f, 10.2765f)
        lineTo(18.5832f, 18.7926f)
        curveTo(19.9924f, 19.732f, 20.697f, 20.2018f, 20.449f, 20.6009f)
        curveTo(20.201f, 21f, 19.2046f, 21f, 17.2117f, 21f)
        horizontalLineTo(6.37733f)
        curveTo(4.54862f, 21f, 3.63426f, 21f, 3.06616f, 20.6213f)
        curveTo(2.49805f, 20.2425f, 2.49805f, 19.633f, 2.49805f, 18.4138f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.49805f, 11f)
        curveTo(10.7072f, 11f, 12.498f, 9.20914f, 12.498f, 7f)
        curveTo(12.498f, 4.79086f, 10.7072f, 3f, 8.49805f, 3f)
        curveTo(6.28891f, 3f, 4.49805f, 4.79086f, 4.49805f, 7f)
        curveTo(4.49805f, 9.20914f, 6.28891f, 11f, 8.49805f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.502f, 9.996f)
        lineTo(21.4055f, 13.38f)
        moveTo(21.4055f, 13.38f)
        curveTo(21.7255f, 13.0406f, 21.1848f, 12.06f, 20.7283f, 10.728f)
        moveTo(21.4055f, 13.38f)
        curveTo(21.1848f, 13.62f, 20.4639f, 13.68f, 18.7639f, 13.998f)
        }
        }.build()

        return _acceleration!!
    }

private var _acceleration: ImageVector? = null
