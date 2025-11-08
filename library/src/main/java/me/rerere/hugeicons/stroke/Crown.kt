package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = ImageVector.Builder(
            name = "Crown",
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
        moveTo(3.51819f, 10.3058f)
        curveTo(3.13013f, 9.23176f, 2.9361f, 8.69476f, 3.01884f, 8.35065f)
        curveTo(3.10933f, 7.97427f, 3.377f, 7.68084f, 3.71913f, 7.58296f)
        curveTo(4.03193f, 7.49346f, 4.51853f, 7.70973f, 5.49173f, 8.14227f)
        curveTo(6.35253f, 8.52486f, 6.78293f, 8.71615f, 7.18732f, 8.70551f)
        curveTo(7.63257f, 8.69379f, 8.06088f, 8.51524f, 8.4016f, 8.19931f)
        curveTo(8.71105f, 7.91237f, 8.91861f, 7.45513f, 9.33373f, 6.54064f)
        lineTo(10.2486f, 4.52525f)
        curveTo(11.0128f, 2.84175f, 11.3949f, 2f, 12f, 2f)
        curveTo(12.6051f, 2f, 12.9872f, 2.84175f, 13.7514f, 4.52525f)
        lineTo(14.6663f, 6.54064f)
        curveTo(15.0814f, 7.45513f, 15.289f, 7.91237f, 15.5984f, 8.19931f)
        curveTo(15.9391f, 8.51524f, 16.3674f, 8.69379f, 16.8127f, 8.70551f)
        curveTo(17.2171f, 8.71615f, 17.6475f, 8.52486f, 18.5083f, 8.14227f)
        curveTo(19.4815f, 7.70973f, 19.9681f, 7.49346f, 20.2809f, 7.58296f)
        curveTo(20.623f, 7.68084f, 20.8907f, 7.97427f, 20.9812f, 8.35065f)
        curveTo(21.0639f, 8.69476f, 20.8699f, 9.23176f, 20.4818f, 10.3057f)
        lineTo(18.8138f, 14.9222f)
        curveTo(18.1002f, 16.897f, 17.7435f, 17.8844f, 16.9968f, 18.4422f)
        curveTo(16.2502f, 19f, 15.2854f, 19f, 13.3558f, 19f)
        horizontalLineTo(10.6442f)
        curveTo(8.71459f, 19f, 7.74977f, 19f, 7.00315f, 18.4422f)
        curveTo(6.25654f, 17.8844f, 5.89977f, 16.897f, 5.18622f, 14.9222f)
        lineTo(3.51819f, 10.3058f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        horizontalLineTo(17f)
        }
        }.build()

        return _crown!!
    }

private var _crown: ImageVector? = null
