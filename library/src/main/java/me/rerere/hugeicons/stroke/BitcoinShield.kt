package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinShield: ImageVector
    get() {
        if (_bitcoinShield != null) {
            return _bitcoinShield!!
        }
        _bitcoinShield = ImageVector.Builder(
            name = "BitcoinShield",
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
        moveTo(10.125f, 14.5001f)
        lineTo(10.125f, 8.50012f)
        moveTo(12f, 8.50012f)
        verticalLineTo(7.00012f)
        moveTo(12f, 16.0001f)
        verticalLineTo(14.5001f)
        moveTo(10.125f, 11.5001f)
        horizontalLineTo(13.875f)
        moveTo(13.875f, 11.5001f)
        curveTo(14.4963f, 11.5001f, 15f, 12.0038f, 15f, 12.6251f)
        verticalLineTo(13.3751f)
        curveTo(15f, 13.9964f, 14.4963f, 14.5001f, 13.875f, 14.5001f)
        horizontalLineTo(9f)
        moveTo(13.875f, 11.5001f)
        curveTo(14.4963f, 11.5001f, 15f, 10.9964f, 15f, 10.3751f)
        verticalLineTo(9.62512f)
        curveTo(15f, 9.0038f, 14.4963f, 8.50012f, 13.875f, 8.50012f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1835f)
        verticalLineTo(8.28047f)
        curveTo(21f, 6.64047f, 21f, 5.82047f, 20.5959f, 5.28547f)
        curveTo(20.1918f, 4.75048f, 19.2781f, 4.49075f, 17.4507f, 3.97128f)
        curveTo(16.2022f, 3.61638f, 15.1016f, 3.18881f, 14.2223f, 2.79847f)
        curveTo(13.0234f, 2.26628f, 12.424f, 2.00018f, 12f, 2.00018f)
        curveTo(11.576f, 2.00018f, 10.9766f, 2.26628f, 9.77771f, 2.79847f)
        curveTo(8.89839f, 3.18881f, 7.79784f, 3.61638f, 6.54933f, 3.97128f)
        curveTo(4.72193f, 4.49075f, 3.80822f, 4.75048f, 3.40411f, 5.28547f)
        curveTo(3f, 5.82047f, 3f, 6.64047f, 3f, 8.28047f)
        verticalLineTo(11.1835f)
        curveTo(3f, 16.8087f, 8.06277f, 20.1837f, 10.594f, 21.5196f)
        curveTo(11.2011f, 21.84f, 11.5046f, 22.0002f, 12f, 22.0002f)
        curveTo(12.4954f, 22.0002f, 12.7989f, 21.84f, 13.406f, 21.5196f)
        curveTo(15.9372f, 20.1837f, 21f, 16.8087f, 21f, 11.1835f)
        }
        }.build()

        return _bitcoinShield!!
    }

private var _bitcoinShield: ImageVector? = null
