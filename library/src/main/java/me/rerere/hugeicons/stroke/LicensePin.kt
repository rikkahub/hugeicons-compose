package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LicensePin: ImageVector
    get() {
        if (_licensePin != null) {
            return _licensePin!!
        }
        _licensePin = ImageVector.Builder(
            name = "LicensePin",
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
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        moveTo(7f, 12f)
        horizontalLineTo(12.5f)
        moveTo(7f, 17f)
        lineTo(11f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 11f)
        verticalLineTo(10f)
        curveTo(19.5f, 6.22876f, 19.5f, 4.34315f, 18.3284f, 3.17157f)
        curveTo(17.1569f, 2f, 15.2712f, 2f, 11.5f, 2f)
        horizontalLineTo(10.5001f)
        curveTo(6.7289f, 2f, 4.84329f, 2f, 3.67172f, 3.17156f)
        curveTo(2.50015f, 4.34312f, 2.50014f, 6.22872f, 2.5001f, 9.99993f)
        lineTo(2.50007f, 13.9999f)
        curveTo(2.50004f, 17.7712f, 2.50002f, 19.6568f, 3.67159f, 20.8284f)
        curveTo(4.84317f, 22f, 6.7288f, 22f, 10.5001f, 22f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 19f)
        horizontalLineTo(17.0754f)
        curveTo(16.1713f, 19f, 15.7192f, 19f, 15.5534f, 18.7463f)
        curveTo(15.3875f, 18.4927f, 15.6201f, 18.157f, 16.0853f, 17.4855f)
        lineTo(16.5384f, 16.8315f)
        curveTo(16.6519f, 16.6677f, 16.7086f, 16.5858f, 16.727f, 16.4938f)
        curveTo(16.7454f, 16.4019f, 16.7238f, 16.3083f, 16.6805f, 16.1209f)
        lineTo(16.4669f, 15.1961f)
        curveTo(16.3391f, 14.6427f, 16.2753f, 14.366f, 16.4485f, 14.183f)
        curveTo(16.6217f, 14f, 16.9475f, 14f, 17.5992f, 14f)
        horizontalLineTo(19.4008f)
        curveTo(20.0525f, 14f, 20.3783f, 14f, 20.5515f, 14.183f)
        curveTo(20.7248f, 14.366f, 20.6609f, 14.6427f, 20.5331f, 15.1961f)
        lineTo(20.3195f, 16.1209f)
        curveTo(20.2762f, 16.3083f, 20.2546f, 16.4019f, 20.273f, 16.4938f)
        curveTo(20.2914f, 16.5858f, 20.3481f, 16.6677f, 20.4616f, 16.8315f)
        lineTo(20.9147f, 17.4855f)
        curveTo(21.3799f, 18.157f, 21.6125f, 18.4927f, 21.4466f, 18.7463f)
        curveTo(21.2808f, 19f, 20.8287f, 19f, 19.9246f, 19f)
        horizontalLineTo(18.5f)
        moveTo(18.5f, 19f)
        verticalLineTo(22f)
        }
        }.build()

        return _licensePin!!
    }

private var _licensePin: ImageVector? = null
