package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirplaneMode: ImageVector
    get() {
        if (_airplaneMode != null) {
            return _airplaneMode!!
        }
        _airplaneMode = ImageVector.Builder(
            name = "AirplaneMode",
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
        moveTo(4.41712f, 11.9183f)
        lineTo(7.73859f, 9.89656f)
        curveTo(8.29597f, 9.55783f, 8.57467f, 9.38846f, 8.76705f, 9.15616f)
        curveTo(9.59962f, 8.15082f, 8.86644f, 6.66595f, 8.99059f, 5.49686f)
        curveTo(9.1191f, 4.28671f, 10.2731f, 2.63158f, 11.4364f, 2.11845f)
        curveTo(11.7944f, 1.96052f, 12.2051f, 1.96052f, 12.5631f, 2.11845f)
        curveTo(13.7264f, 2.63158f, 14.8804f, 4.28671f, 15.0089f, 5.49686f)
        curveTo(15.1331f, 6.66595f, 14.3999f, 8.15082f, 15.2325f, 9.15616f)
        curveTo(15.4248f, 9.38846f, 15.7035f, 9.55783f, 16.2609f, 9.89656f)
        lineTo(19.5827f, 11.9182f)
        curveTo(20.5993f, 12.5369f, 20.9998f, 13.1973f, 20.9998f, 14.4395f)
        curveTo(20.9998f, 15.1156f, 20.7006f, 15.2968f, 20.0973f, 15.1588f)
        lineTo(14.2725f, 13.8261f)
        lineTo(14.0109f, 16.1149f)
        curveTo(13.9161f, 16.9448f, 13.8687f, 17.3598f, 14.0058f, 17.7398f)
        curveTo(14.327f, 18.63f, 15.4173f, 19.3591f, 16.0832f, 20.0066f)
        curveTo(16.4513f, 20.3644f, 16.8529f, 21.3934f, 16.4333f, 21.8613f)
        curveTo(16.1742f, 22.1503f, 15.7533f, 21.9157f, 15.4637f, 21.803f)
        lineTo(12.675f, 20.7184f)
        curveTo(12.3416f, 20.5887f, 12.1748f, 20.5239f, 11.9998f, 20.5239f)
        curveTo(11.8247f, 20.5239f, 11.6579f, 20.5887f, 11.3245f, 20.7184f)
        lineTo(8.53584f, 21.803f)
        curveTo(8.24619f, 21.9157f, 7.82534f, 22.1503f, 7.56625f, 21.8613f)
        curveTo(7.1466f, 21.3934f, 7.54825f, 20.3644f, 7.91628f, 20.0066f)
        curveTo(8.5822f, 19.3591f, 9.67255f, 18.63f, 9.9937f, 17.7398f)
        curveTo(10.1308f, 17.3598f, 10.0834f, 16.9448f, 9.98857f, 16.1149f)
        lineTo(9.72703f, 13.8261f)
        lineTo(3.90259f, 15.1587f)
        curveTo(3.29902f, 15.2968f, 2.99982f, 15.1155f, 3.00001f, 14.4391f)
        curveTo(3.00034f, 13.1971f, 3.4007f, 12.537f, 4.41712f, 11.9183f)
        }
        }.build()

        return _airplaneMode!!
    }

private var _airplaneMode: ImageVector? = null
