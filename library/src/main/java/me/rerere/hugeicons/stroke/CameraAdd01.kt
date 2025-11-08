package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CameraAdd01: ImageVector
    get() {
        if (_cameraAdd01 != null) {
            return _cameraAdd01!!
        }
        _cameraAdd01 = ImageVector.Builder(
            name = "CameraAdd01",
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
        moveTo(22.0002f, 8.99998f)
        verticalLineTo(15f)
        curveTo(22.0002f, 17.8284f, 22.0002f, 19.2426f, 21.1215f, 20.1213f)
        curveTo(20.2428f, 21f, 18.8286f, 21f, 16.0002f, 21f)
        horizontalLineTo(8.00018f)
        curveTo(5.17176f, 21f, 3.75754f, 21f, 2.87886f, 20.1213f)
        curveTo(2.00018f, 19.2426f, 2.00018f, 17.8284f, 2.00018f, 15f)
        verticalLineTo(11.0537f)
        curveTo(2.00018f, 10.0736f, 2.00018f, 9.58356f, 2.1136f, 9.18288f)
        curveTo(2.39734f, 8.18054f, 3.18074f, 7.39714f, 4.18307f, 7.11341f)
        curveTo(4.58376f, 6.99998f, 5.07379f, 6.99998f, 6.05387f, 6.99998f)
        curveTo(6.41985f, 6.99998f, 6.60284f, 6.99998f, 6.77329f, 6.97027f)
        curveTo(7.19563f, 6.89665f, 7.58313f, 6.68926f, 7.87867f, 6.37869f)
        curveTo(7.99794f, 6.25335f, 8.29718f, 5.8045f, 8.50018f, 5.49998f)
        curveTo(8.89656f, 4.90543f, 9.09474f, 4.60815f, 9.36568f, 4.40365f)
        curveTo(9.53113f, 4.27877f, 9.71499f, 4.18038f, 9.91067f, 4.11198f)
        curveTo(10.2311f, 3.99998f, 10.5884f, 3.99998f, 11.303f, 3.99998f)
        horizontalLineTo(13.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0002f, 13.5f)
        curveTo(16.0002f, 15.7091f, 14.2093f, 17.5f, 12.0002f, 17.5f)
        curveTo(9.79104f, 17.5f, 8.00018f, 15.7091f, 8.00018f, 13.5f)
        curveTo(8.00018f, 11.2908f, 9.79104f, 9.49998f, 12.0002f, 9.49998f)
        curveTo(14.2093f, 9.49998f, 16.0002f, 11.2908f, 16.0002f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0002f, 5.49998f)
        horizontalLineTo(21.0002f)
        moveTo(18.5002f, 7.99998f)
        verticalLineTo(2.99998f)
        }
        }.build()

        return _cameraAdd01!!
    }

private var _cameraAdd01: ImageVector? = null
