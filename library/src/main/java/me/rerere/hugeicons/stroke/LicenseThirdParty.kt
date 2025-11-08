package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LicenseThirdParty: ImageVector
    get() {
        if (_licenseThirdParty != null) {
            return _licenseThirdParty!!
        }
        _licenseThirdParty = ImageVector.Builder(
            name = "LicenseThirdParty",
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
        moveTo(19.4999f, 10f)
        curveTo(19.4999f, 6.22876f, 19.4999f, 4.34315f, 18.3284f, 3.17157f)
        curveTo(17.1568f, 2f, 15.2712f, 2f, 11.4999f, 2f)
        horizontalLineTo(10.5f)
        curveTo(6.72883f, 2f, 4.84323f, 2f, 3.67166f, 3.17156f)
        curveTo(2.50008f, 4.34312f, 2.50007f, 6.22872f, 2.50004f, 9.99993f)
        lineTo(2.5f, 13.9999f)
        curveTo(2.49997f, 17.7712f, 2.49995f, 19.6568f, 3.67153f, 20.8284f)
        curveTo(4.8431f, 22f, 6.72873f, 22f, 10.5f, 22f)
        horizontalLineTo(12f)
        }

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
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8613f, 22f)
        horizontalLineTo(20.1387f)
        curveTo(21.0238f, 22f, 21.7723f, 21.3987f, 21.4039f, 20.753f)
        curveTo(20.8135f, 19.7186f, 19.5114f, 19f, 18f, 19f)
        curveTo(16.4886f, 19f, 15.1865f, 19.7186f, 14.5961f, 20.753f)
        curveTo(14.2277f, 21.3987f, 14.9762f, 22f, 15.8613f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9969f, 16.5f)
        curveTo(18.9639f, 16.5f, 19.7477f, 15.7165f, 19.7477f, 14.75f)
        curveTo(19.7477f, 13.7835f, 18.9639f, 13f, 17.9969f, 13f)
        curveTo(17.03f, 13f, 16.2461f, 13.7835f, 16.2461f, 14.75f)
        curveTo(16.2461f, 15.7165f, 17.03f, 16.5f, 17.9969f, 16.5f)
        }
        }.build()

        return _licenseThirdParty!!
    }

private var _licenseThirdParty: ImageVector? = null
