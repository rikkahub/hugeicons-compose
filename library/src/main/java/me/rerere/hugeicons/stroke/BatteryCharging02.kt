package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BatteryCharging02: ImageVector
    get() {
        if (_batteryCharging02 != null) {
            return _batteryCharging02!!
        }
        _batteryCharging02 = ImageVector.Builder(
            name = "BatteryCharging02",
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
        moveTo(8f, 6f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.44798f, 17.6906f, 4.24209f, 17.8911f, 5.5f, 17.9616f)
        moveTo(12f, 17.9827f)
        lineTo(13f, 18f)
        curveTo(15.8284f, 18f, 17.2426f, 18f, 18.1213f, 17.1213f)
        curveTo(19f, 16.2426f, 19f, 14.8284f, 19f, 12f)
        curveTo(19f, 9.17157f, 19f, 7.75736f, 18.1213f, 6.87868f)
        curveTo(17.414f, 6.17137f, 16.3597f, 6.03342f, 14.5f, 6.00652f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5623f, 6f)
        lineTo(8.59169f, 10.4367f)
        curveTo(8.13166f, 11.1237f, 7.90164f, 11.4673f, 8.03989f, 11.7336f)
        curveTo(8.17814f, 12f, 8.58645f, 12f, 9.40307f, 12f)
        horizontalLineTo(10.5969f)
        curveTo(11.4136f, 12f, 11.8219f, 12f, 11.9601f, 12.2664f)
        curveTo(12.0984f, 12.5327f, 11.8683f, 12.8763f, 11.4083f, 13.5633f)
        lineTo(8.43769f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9.5f)
        lineTo(20.0272f, 9.6712f)
        curveTo(20.7085f, 9.78475f, 21.0491f, 9.84152f, 21.3076f, 10.0067f)
        curveTo(21.5618f, 10.1691f, 21.7612f, 10.4044f, 21.8796f, 10.6819f)
        curveTo(22f, 10.964f, 22f, 11.3093f, 22f, 12f)
        curveTo(22f, 12.6907f, 22f, 13.036f, 21.8796f, 13.3181f)
        curveTo(21.7612f, 13.5956f, 21.5618f, 13.8309f, 21.3076f, 13.9933f)
        curveTo(21.0491f, 14.1585f, 20.7085f, 14.2153f, 20.0272f, 14.3288f)
        lineTo(19f, 14.5f)
        }
        }.build()

        return _batteryCharging02!!
    }

private var _batteryCharging02: ImageVector? = null
