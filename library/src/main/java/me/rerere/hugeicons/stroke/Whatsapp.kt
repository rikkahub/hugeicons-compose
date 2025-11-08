package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = ImageVector.Builder(
            name = "Whatsapp",
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
        moveTo(8.58815f, 12.3773f)
        lineTo(9.45909f, 11.2956f)
        curveTo(9.82616f, 10.8397f, 10.2799f, 10.4153f, 10.3155f, 9.80826f)
        curveTo(10.3244f, 9.65494f, 10.2166f, 8.96657f, 10.0008f, 7.58986f)
        curveTo(9.91601f, 7.04881f, 9.41086f, 7f, 8.97332f, 7f)
        curveTo(8.40314f, 7f, 8.11805f, 7f, 7.83495f, 7.12931f)
        curveTo(7.47714f, 7.29275f, 7.10979f, 7.75231f, 7.02917f, 8.13733f)
        curveTo(6.96539f, 8.44196f, 7.01279f, 8.65187f, 7.10759f, 9.07169f)
        curveTo(7.51023f, 10.8548f, 8.45481f, 12.6158f, 9.91948f, 14.0805f)
        curveTo(11.3842f, 15.5452f, 13.1452f, 16.4898f, 14.9283f, 16.8924f)
        curveTo(15.3481f, 16.9872f, 15.558f, 17.0346f, 15.8627f, 16.9708f)
        curveTo(16.2477f, 16.8902f, 16.7072f, 16.5229f, 16.8707f, 16.165f)
        curveTo(17f, 15.8819f, 17f, 15.5969f, 17f, 15.0267f)
        curveTo(17f, 14.5891f, 16.9512f, 14.084f, 16.4101f, 13.9992f)
        curveTo(15.0334f, 13.7834f, 14.3451f, 13.6756f, 14.1917f, 13.6845f)
        curveTo(13.5847f, 13.7201f, 13.1603f, 14.1738f, 12.7044f, 14.5409f)
        lineTo(11.6227f, 15.4118f)
        }
        }.build()

        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null
