package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RenewableEnergy01: ImageVector
    get() {
        if (_renewableEnergy01 != null) {
            return _renewableEnergy01!!
        }
        _renewableEnergy01 = ImageVector.Builder(
            name = "RenewableEnergy01",
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
        moveTo(18f, 7.26294f)
        curveTo(20.412f, 8.60838f, 22f, 10.8996f, 22f, 13.5f)
        curveTo(22f, 15.5586f, 21.0047f, 17.4235f, 19.3933f, 18.7787f)
        curveTo(19.1517f, 18.9819f, 19f, 19.2762f, 19f, 19.5919f)
        verticalLineTo(22f)
        horizontalLineTo(17f)
        lineTo(16.2062f, 20.8674f)
        curveTo(16.083f, 20.6916f, 15.8616f, 20.6152f, 15.6537f, 20.6687f)
        curveTo(13.9248f, 21.1132f, 12.0752f, 21.1132f, 10.3463f, 20.6687f)
        curveTo(10.1384f, 20.6152f, 9.91703f, 20.6916f, 9.79384f, 20.8674f)
        lineTo(9f, 22f)
        horizontalLineTo(7f)
        verticalLineTo(19.6154f)
        curveTo(7f, 19.2866f, 6.83835f, 18.9788f, 6.56764f, 18.7921f)
        curveTo(5.49285f, 18.0511f, 2f, 16.6014f, 2f, 15.0582f)
        verticalLineTo(13.5f)
        curveTo(2f, 12.9082f, 2.44771f, 12.4286f, 3f, 12.4286f)
        curveTo(3.60665f, 12.4286f, 4.10188f, 12.1929f, 4.30205f, 11.5661f)
        curveTo(4.87123f, 9.78376f, 6.20828f, 8.26239f, 8f, 7.26294f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 2f)
        lineTo(11f, 6f)
        horizontalLineTo(15f)
        lineTo(12.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49981f, 12f)
        horizontalLineTo(7.50879f)
        }
        }.build()

        return _renewableEnergy01!!
    }

private var _renewableEnergy01: ImageVector? = null
