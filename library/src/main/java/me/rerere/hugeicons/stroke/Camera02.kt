package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Camera02: ImageVector
    get() {
        if (_camera02 != null) {
            return _camera02!!
        }
        _camera02 = ImageVector.Builder(
            name = "Camera02",
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
        moveTo(22f, 14.5f)
        verticalLineTo(8.27201f)
        curveTo(22f, 7.01721f, 20.9828f, 6f, 19.728f, 6f)
        curveTo(19.2679f, 6f, 18.8327f, 5.79084f, 18.5452f, 5.43154f)
        lineTo(18f, 4.75f)
        curveTo(17.6086f, 4.26074f, 17.4129f, 4.01611f, 17.1647f, 3.84705f)
        curveTo(16.9991f, 3.73428f, 16.8176f, 3.64702f, 16.6261f, 3.58819f)
        curveTo(16.3391f, 3.5f, 16.0258f, 3.5f, 15.3992f, 3.5f)
        horizontalLineTo(13.6008f)
        curveTo(12.9742f, 3.5f, 12.6609f, 3.5f, 12.3739f, 3.58819f)
        curveTo(12.1824f, 3.64702f, 12.0009f, 3.73428f, 11.8353f, 3.84705f)
        curveTo(11.5871f, 4.01611f, 11.3914f, 4.26074f, 11f, 4.75f)
        curveTo(10.6086f, 5.23926f, 10.4129f, 5.48389f, 10.1647f, 5.65295f)
        curveTo(9.99914f, 5.76572f, 9.81759f, 5.85298f, 9.62612f, 5.91181f)
        curveTo(9.33906f, 6f, 9.02578f, 6f, 8.39922f, 6f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        verticalLineTo(14.5f)
        curveTo(2f, 17.3284f, 2f, 18.7426f, 2.87868f, 19.6213f)
        curveTo(3.75736f, 20.5f, 5.17157f, 20.5f, 8f, 20.5f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 20.5f, 20.2426f, 20.5f, 21.1213f, 19.6213f)
        curveTo(22f, 18.7426f, 22f, 17.3284f, 22f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5309f, 13f)
        curveTo(18.5309f, 15.2091f, 16.74f, 17f, 14.5309f, 17f)
        curveTo(12.3217f, 17f, 10.5309f, 15.2091f, 10.5309f, 13f)
        curveTo(10.5309f, 10.7909f, 12.3217f, 9f, 14.5309f, 9f)
        curveTo(16.74f, 9f, 18.5309f, 10.7909f, 18.5309f, 13f)
        }
        }.build()

        return _camera02!!
    }

private var _camera02: ImageVector? = null
