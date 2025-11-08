package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WhatsappBusiness: ImageVector
    get() {
        if (_whatsappBusiness != null) {
            return _whatsappBusiness!!
        }
        _whatsappBusiness = ImageVector.Builder(
            name = "WhatsappBusiness",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 13.3789f, 2.27907f, 14.6926f, 2.78382f, 15.8877f)
        curveTo(3.06278f, 16.5481f, 3.20226f, 16.8784f, 3.21953f, 17.128f)
        curveTo(3.2368f, 17.3776f, 3.16334f, 17.6521f, 3.01642f, 18.2012f)
        lineTo(2f, 22f)
        lineTo(5.79877f, 20.9836f)
        curveTo(6.34788f, 20.8367f, 6.62244f, 20.7632f, 6.87202f, 20.7805f)
        curveTo(7.12161f, 20.7977f, 7.45185f, 20.9372f, 8.11235f, 21.2162f)
        curveTo(9.30745f, 21.7209f, 10.6211f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.8824f, 12f)
        curveTo(14.0519f, 12f, 15f, 13.0074f, 15f, 14.25f)
        curveTo(15f, 15.4926f, 14.0519f, 16.5f, 12.8824f, 16.5f)
        horizontalLineTo(10.4118f)
        curveTo(9.74625f, 16.5f, 9.4135f, 16.5f, 9.20675f, 16.2972f)
        curveTo(9f, 16.0945f, 9f, 15.7681f, 9f, 15.1154f)
        verticalLineTo(12f)
        moveTo(12.8824f, 12f)
        curveTo(14.0519f, 12f, 15f, 10.9926f, 15f, 9.75f)
        curveTo(15f, 8.50736f, 14.0519f, 7.5f, 12.8824f, 7.5f)
        horizontalLineTo(10.4118f)
        curveTo(9.74625f, 7.5f, 9.4135f, 7.5f, 9.20675f, 7.70277f)
        curveTo(9f, 7.90554f, 9f, 8.2319f, 9f, 8.88462f)
        verticalLineTo(12f)
        moveTo(12.8824f, 12f)
        horizontalLineTo(9f)
        }
        }.build()

        return _whatsappBusiness!!
    }

private var _whatsappBusiness: ImageVector? = null
