package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinPiggyBank: ImageVector
    get() {
        if (_bitcoinPiggyBank != null) {
            return _bitcoinPiggyBank!!
        }
        _bitcoinPiggyBank = ImageVector.Builder(
            name = "BitcoinPiggyBank",
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
        moveTo(21.5f, 11.0288f)
        curveTo(21.8239f, 11.8026f, 22f, 12.6342f, 22f, 13.5f)
        curveTo(22f, 15.5586f, 21.0047f, 17.4235f, 19.3933f, 18.7788f)
        curveTo(19.1517f, 18.982f, 19f, 19.2762f, 19f, 19.5919f)
        verticalLineTo(22f)
        horizontalLineTo(17f)
        lineTo(16.2062f, 20.8674f)
        curveTo(16.083f, 20.6916f, 15.8616f, 20.6153f, 15.6537f, 20.6687f)
        curveTo(13.9248f, 21.1132f, 12.0752f, 21.1132f, 10.3463f, 20.6687f)
        curveTo(10.1384f, 20.6153f, 9.91703f, 20.6916f, 9.79384f, 20.8674f)
        lineTo(9f, 22f)
        horizontalLineTo(7f)
        verticalLineTo(19.6154f)
        curveTo(7f, 19.2866f, 6.83835f, 18.9788f, 6.56764f, 18.7922f)
        curveTo(5.49285f, 18.0511f, 2f, 16.6014f, 2f, 15.0582f)
        verticalLineTo(13.5f)
        curveTo(2f, 12.9083f, 2.44771f, 12.4286f, 3f, 12.4286f)
        curveTo(3.60665f, 12.4286f, 4.10188f, 12.1929f, 4.30205f, 11.5661f)
        curveTo(5.06912f, 9.16411f, 7.23085f, 7.23604f, 10.0206f, 6.42073f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.125f, 9.5f)
        lineTo(14.125f, 3.5f)
        moveTo(16f, 3.5f)
        verticalLineTo(2f)
        moveTo(16f, 11f)
        verticalLineTo(9.5f)
        moveTo(14.125f, 6.5f)
        horizontalLineTo(17.875f)
        moveTo(17.875f, 6.5f)
        curveTo(18.4963f, 6.5f, 19f, 7.00368f, 19f, 7.625f)
        verticalLineTo(8.375f)
        curveTo(19f, 8.99632f, 18.4963f, 9.5f, 17.875f, 9.5f)
        horizontalLineTo(13f)
        moveTo(17.875f, 6.5f)
        curveTo(18.4963f, 6.5f, 19f, 5.99632f, 19f, 5.375f)
        verticalLineTo(4.625f)
        curveTo(19f, 4.00368f, 18.4963f, 3.5f, 17.875f, 3.5f)
        horizontalLineTo(13f)
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

        return _bitcoinPiggyBank!!
    }

private var _bitcoinPiggyBank: ImageVector? = null
