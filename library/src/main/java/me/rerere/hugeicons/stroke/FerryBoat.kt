package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FerryBoat: ImageVector
    get() {
        if (_ferryBoat != null) {
            return _ferryBoat!!
        }
        _ferryBoat = ImageVector.Builder(
            name = "FerryBoat",
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
        moveTo(19.0203f, 14.3033f)
        lineTo(17.8099f, 17f)
        moveTo(19.0203f, 14.3033f)
        horizontalLineTo(16f)
        moveTo(19.0203f, 14.3033f)
        curveTo(19.7848f, 12.5999f, 20.1671f, 11.7483f, 19.9303f, 10.9736f)
        curveTo(19.9079f, 10.9f, 19.8814f, 10.8278f, 19.8512f, 10.7573f)
        curveTo(19.5333f, 10.016f, 18.7088f, 9.65877f, 17.0598f, 8.94437f)
        lineTo(14.201f, 7.70592f)
        curveTo(13.1147f, 7.23531f, 12.5716f, 7f, 12f, 7f)
        curveTo(11.4284f, 7f, 10.8853f, 7.23531f, 9.79896f, 7.70592f)
        lineTo(6.94025f, 8.94437f)
        curveTo(5.2912f, 9.65877f, 4.46668f, 10.016f, 4.14878f, 10.7573f)
        curveTo(4.11857f, 10.8278f, 4.09215f, 10.9f, 4.06965f, 10.9736f)
        curveTo(3.83293f, 11.7483f, 4.21519f, 12.5999f, 4.97971f, 14.3033f)
        moveTo(6.1901f, 17f)
        lineTo(4.97971f, 14.3033f)
        moveTo(4.97971f, 14.3033f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9f)
        verticalLineTo(8f)
        curveTo(18f, 6.11438f, 18f, 5.17157f, 17.4142f, 4.58579f)
        curveTo(16.8284f, 4f, 15.8856f, 4f, 14f, 4f)
        horizontalLineTo(10f)
        curveTo(8.11438f, 4f, 7.17157f, 4f, 6.58579f, 4.58579f)
        curveTo(6f, 5.17157f, 6f, 6.11438f, 6f, 8f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21.1932f)
        curveTo(2.68524f, 22.2443f, 3.57104f, 22.2443f, 4.27299f, 21.1932f)
        curveTo(6.52985f, 17.7408f, 8.67954f, 23.6764f, 10.273f, 21.2321f)
        curveTo(12.703f, 17.5694f, 14.4508f, 23.9218f, 16.273f, 21.1932f)
        curveTo(18.6492f, 17.5582f, 20.1295f, 23.5776f, 22f, 21.5842f)
        }
        }.build()

        return _ferryBoat!!
    }

private var _ferryBoat: ImageVector? = null
