package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DentalBrokenTooth: ImageVector
    get() {
        if (_dentalBrokenTooth != null) {
            return _dentalBrokenTooth!!
        }
        _dentalBrokenTooth = ImageVector.Builder(
            name = "DentalBrokenTooth",
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
        moveTo(11.9766f, 5.17632f)
        curveTo(12.1974f, 4.99352f, 12.4268f, 4.78582f, 12.6639f, 4.55032f)
        curveTo(14.9635f, 2.2656f, 18.0955f, 2.71292f, 19.5629f, 4.55032f)
        curveTo(23.1682f, 9.06434f, 19.1305f, 16.1442f, 16.8219f, 20.2396f)
        curveTo(16.559f, 20.7058f, 16.0355f, 21f, 15.4715f, 21f)
        curveTo(14.5719f, 21f, 13.8687f, 20.2801f, 13.8395f, 19.4399f)
        curveTo(13.7789f, 17.7005f, 13.3749f, 15.5947f, 12f, 15.5f)
        curveTo(10.6251f, 15.5947f, 10.1743f, 17.7005f, 10.1138f, 19.4399f)
        curveTo(10.0845f, 20.2801f, 9.38138f, 21f, 8.48173f, 21f)
        curveTo(7.9178f, 21f, 7.39422f, 20.7058f, 7.13139f, 20.2396f)
        curveTo(3.84385f, 14.4077f, 2.95445f, 10.7488f, 3.00177f, 8.4f)
        curveTo(5f, 8.5f, 5.99221f, 7.5f, 5.99221f, 5.7f)
        curveTo(8f, 6f, 9f, 4.82865f, 9f, 3f)
        curveTo(10f, 3f, 10.5745f, 3.84009f, 11.2894f, 4.55032f)
        curveTo(11.5264f, 4.78582f, 11.7558f, 4.99352f, 11.9766f, 5.17632f)
        moveTo(11.9766f, 5.17632f)
        curveTo(13.4694f, 6.41228f, 14.5f, 6.5f, 15f, 6f)
        }
        }.build()

        return _dentalBrokenTooth!!
    }

private var _dentalBrokenTooth: ImageVector? = null
