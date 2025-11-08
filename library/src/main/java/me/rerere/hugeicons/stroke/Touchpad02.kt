package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touchpad02: ImageVector
    get() {
        if (_touchpad02 != null) {
            return _touchpad02!!
        }
        _touchpad02 = ImageVector.Builder(
            name = "Touchpad02",
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
        moveTo(11.1957f, 14.1439f)
        lineTo(13f, 15.7621f)
        verticalLineTo(7.49993f)
        curveTo(13f, 6.6715f, 13.6716f, 5.99993f, 14.5f, 5.99993f)
        curveTo(15.3284f, 5.99993f, 16f, 6.6715f, 16f, 7.49993f)
        verticalLineTo(11.982f)
        lineTo(17.7888f, 12.2968f)
        curveTo(19.2636f, 12.5405f, 20.001f, 12.6623f, 20.5205f, 13.0049f)
        curveTo(21.3784f, 13.571f, 22f, 14.421f, 22f, 15.6619f)
        curveTo(22f, 16.5263f, 21.806f, 17.1062f, 21.3344f, 18.6642f)
        curveTo(21.0352f, 19.6527f, 20.8855f, 20.147f, 20.6416f, 20.5383f)
        curveTo(20.2399f, 21.1825f, 19.6473f, 21.6529f, 18.9653f, 21.8688f)
        curveTo(18.551f, 22f, 18.0779f, 22f, 17.1316f, 22f)
        horizontalLineTo(16.3295f)
        curveTo(15.0714f, 22f, 14.4424f, 22f, 13.8824f, 21.7458f)
        curveTo(13.7819f, 21.7002f, 13.6838f, 21.6488f, 13.5883f, 21.5917f)
        curveTo(13.056f, 21.2734f, 12.6594f, 20.7357f, 11.866f, 19.6605f)
        lineTo(9.29778f, 16.1796f)
        curveTo(8.90312f, 15.6447f, 8.90049f, 14.8792f, 9.29146f, 14.341f)
        curveTo(9.76138f, 13.6941f, 10.6245f, 13.6048f, 11.1957f, 14.1439f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9.99989f)
        curveTo(22f, 6.22866f, 22f, 4.34304f, 20.8284f, 3.17147f)
        curveTo(19.6569f, 1.99989f, 17.7712f, 1.99989f, 14f, 1.99989f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 1.99989f, 4.34315f, 1.99989f, 3.17157f, 3.17147f)
        curveTo(2f, 4.34304f, 2f, 6.22866f, 2f, 9.99989f)
        verticalLineTo(11.9999f)
        curveTo(2f, 13.8637f, 2f, 14.7955f, 2.30448f, 15.5306f)
        curveTo(2.71046f, 16.5107f, 3.48915f, 17.2894f, 4.46927f, 17.6954f)
        curveTo(5.05932f, 17.9398f, 5.77617f, 17.988f, 7f, 17.9976f)
        }
        }.build()

        return _touchpad02!!
    }

private var _touchpad02: ImageVector? = null
