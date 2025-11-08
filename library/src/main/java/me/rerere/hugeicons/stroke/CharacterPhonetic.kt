package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CharacterPhonetic: ImageVector
    get() {
        if (_characterPhonetic != null) {
            return _characterPhonetic!!
        }
        _characterPhonetic = ImageVector.Builder(
            name = "CharacterPhonetic",
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
        moveTo(21.8265f, 15.914f)
        curveTo(21.547f, 17.6702f, 20.1625f, 19.0475f, 18.3974f, 19.3257f)
        curveTo(18.0767f, 19.3762f, 17.6935f, 19.3762f, 16.9269f, 19.3762f)
        curveTo(16.1605f, 19.3762f, 15.7772f, 19.3762f, 15.4566f, 19.3257f)
        curveTo(13.6913f, 19.0475f, 12.307f, 17.6702f, 12.0274f, 15.914f)
        curveTo(11.9766f, 15.595f, 11.9766f, 15.2137f, 11.9766f, 14.4511f)
        verticalLineTo(11.1678f)
        moveTo(11.9766f, 11.1678f)
        verticalLineTo(9.52611f)
        curveTo(11.9766f, 8.76355f, 11.9766f, 8.38226f, 12.0274f, 8.06324f)
        curveTo(12.307f, 6.30708f, 13.6913f, 4.92975f, 15.4566f, 4.65161f)
        curveTo(15.7772f, 4.60107f, 16.1605f, 4.60107f, 16.9269f, 4.60107f)
        curveTo(17.6935f, 4.60107f, 18.0767f, 4.60107f, 18.3974f, 4.65161f)
        curveTo(20.1625f, 4.92975f, 21.547f, 6.30708f, 21.8265f, 8.06324f)
        curveTo(22.0246f, 9.30724f, 22.1236f, 9.92925f, 21.735f, 10.474f)
        curveTo(21.6818f, 10.5485f, 21.604f, 10.6387f, 21.538f, 10.7024f)
        curveTo(21.0558f, 11.1678f, 20.2841f, 11.1678f, 18.7406f, 11.1678f)
        horizontalLineTo(11.9766f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.31275f, 7.01759f)
        curveTo(2.73674f, 6.26621f, 3.90352f, 4.92483f, 5.39093f, 4.66213f)
        curveTo(6.87834f, 4.39943f, 9.43964f, 4.26817f, 10.7078f, 5.8272f)
        curveTo(11.976f, 7.38622f, 11.976f, 9.04262f, 11.976f, 11.1966f)
        moveTo(11.976f, 11.1966f)
        curveTo(11.976f, 12.4377f, 11.9409f, 12.8351f, 11.8271f, 13.6534f)
        curveTo(11.6924f, 14.6227f, 11.6174f, 16.3942f, 10.4447f, 17.6687f)
        curveTo(9.99537f, 18.157f, 9.44783f, 18.5588f, 8.85947f, 18.8657f)
        curveTo(8.12881f, 19.2469f, 7.07561f, 19.5866f, 5.96573f, 19.4788f)
        curveTo(3.87969f, 19.2761f, 2.31274f, 18.0786f, 2.03291f, 15.9582f)
        curveTo(1.85039f, 14.5752f, 2.50517f, 13.1483f, 3.20313f, 12.4377f)
        curveTo(3.90109f, 11.727f, 4.76599f, 11.1179f, 6.25587f, 11.1966f)
        curveTo(7.63844f, 11.2697f, 10.6459f, 11.2135f, 11.976f, 11.1966f)
        }
        }.build()

        return _characterPhonetic!!
    }

private var _characterPhonetic: ImageVector? = null
