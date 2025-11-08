package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ElectricHome01: ImageVector
    get() {
        if (_electricHome01 != null) {
            return _electricHome01!!
        }
        _electricHome01 = ImageVector.Builder(
            name = "ElectricHome01",
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
        moveTo(20f, 8.58505f)
        verticalLineTo(13.5005f)
        curveTo(20f, 17.2717f, 20f, 19.1574f, 18.8284f, 20.3289f)
        curveTo(18.0203f, 21.1371f, 16.8723f, 21.3878f, 15f, 21.4655f)
        moveTo(4f, 8.58505f)
        verticalLineTo(13.5005f)
        curveTo(4f, 17.2717f, 4f, 19.1574f, 5.17157f, 20.3289f)
        curveTo(6.23465f, 21.392f, 7.88563f, 21.4905f, 10.9998f, 21.4996f)
        curveTo(11.5521f, 21.5012f, 12f, 21.0528f, 12f, 20.5005f)
        verticalLineTo(17.5005f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 10.5003f)
        lineTo(17.6569f, 6.33582f)
        curveTo(14.9902f, 3.77883f, 13.6569f, 2.50034f, 12f, 2.50034f)
        curveTo(10.3431f, 2.50034f, 9.00981f, 3.77883f, 6.34315f, 6.33582f)
        lineTo(2f, 10.5003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.001f, 9.00034f)
        verticalLineTo(11.5003f)
        moveTo(10.001f, 11.5003f)
        verticalLineTo(9.00034f)
        moveTo(8.50553f, 12.3803f)
        curveTo(8.46629f, 11.9054f, 8.87602f, 11.5003f, 9.39552f, 11.5003f)
        horizontalLineTo(14.6104f)
        curveTo(15.1299f, 11.5003f, 15.5396f, 11.9054f, 15.5004f, 12.3803f)
        lineTo(15.3931f, 13.6777f)
        curveTo(15.316f, 14.6104f, 14.9786f, 15.5093f, 14.4133f, 16.2879f)
        lineTo(14.0628f, 16.7706f)
        curveTo(13.7319f, 17.2264f, 13.1741f, 17.5003f, 12.5768f, 17.5003f)
        horizontalLineTo(11.4291f)
        curveTo(10.8318f, 17.5003f, 10.2741f, 17.2264f, 9.94308f, 16.7706f)
        lineTo(9.59262f, 16.2879f)
        curveTo(9.02726f, 15.5093f, 8.68984f, 14.6104f, 8.61276f, 13.6777f)
        lineTo(8.50553f, 12.3803f)
        }
        }.build()

        return _electricHome01!!
    }

private var _electricHome01: ImageVector? = null
