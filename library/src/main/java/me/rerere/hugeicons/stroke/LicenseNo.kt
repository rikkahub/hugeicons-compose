package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LicenseNo: ImageVector
    get() {
        if (_licenseNo != null) {
            return _licenseNo!!
        }
        _licenseNo = ImageVector.Builder(
            name = "LicenseNo",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 17f)
        horizontalLineTo(16.5f)
        moveTo(8.5f, 12f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.0576f, 4.0576f)
        curveTo(3.50008f, 5.26072f, 3.50006f, 7.05566f, 3.50004f, 9.99993f)
        lineTo(3.5f, 13.9999f)
        curveTo(3.49997f, 17.7712f, 3.49995f, 19.6568f, 4.67153f, 20.8284f)
        curveTo(5.8431f, 22f, 7.72873f, 22f, 11.5f, 22f)
        horizontalLineTo(12.4999f)
        curveTo(16.2712f, 22f, 18.1568f, 22f, 19.3284f, 20.8284f)
        curveTo(19.5853f, 20.5715f, 19.7858f, 20.2803f, 19.9424f, 19.9424f)
        moveTo(20.4819f, 16.4819f)
        curveTo(20.4999f, 15.7592f, 20.4999f, 10f, 20.4999f, 10f)
        curveTo(20.4999f, 6.22876f, 20.4999f, 4.34315f, 19.3284f, 3.17157f)
        curveTo(18.1568f, 2f, 16.2712f, 2f, 12.4999f, 2f)
        horizontalLineTo(11.5f)
        curveTo(9.107f, 2f, 7.47322f, 2f, 6.29935f, 2.29935f)
        }
        }.build()

        return _licenseNo!!
    }

private var _licenseNo: ImageVector? = null
