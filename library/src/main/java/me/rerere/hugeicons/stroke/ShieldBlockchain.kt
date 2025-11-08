package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShieldBlockchain: ImageVector
    get() {
        if (_shieldBlockchain != null) {
            return _shieldBlockchain!!
        }
        _shieldBlockchain = ImageVector.Builder(
            name = "ShieldBlockchain",
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
        moveTo(21f, 11.1835f)
        verticalLineTo(8.28041f)
        curveTo(21f, 6.64041f, 21f, 5.82041f, 20.5959f, 5.28541f)
        curveTo(20.1918f, 4.75042f, 19.2781f, 4.49068f, 17.4507f, 3.97122f)
        curveTo(16.2022f, 3.61632f, 15.1016f, 3.18875f, 14.2223f, 2.79841f)
        curveTo(13.0234f, 2.26622f, 12.424f, 2.00012f, 12f, 2.00012f)
        curveTo(11.576f, 2.00012f, 10.9766f, 2.26622f, 9.77771f, 2.79841f)
        curveTo(8.89839f, 3.18875f, 7.79784f, 3.61632f, 6.54933f, 3.97122f)
        curveTo(4.72193f, 4.49068f, 3.80822f, 4.75042f, 3.40411f, 5.28541f)
        curveTo(3f, 5.82041f, 3f, 6.64041f, 3f, 8.28041f)
        verticalLineTo(11.1835f)
        curveTo(3f, 16.8086f, 8.06277f, 20.1836f, 10.594f, 21.5195f)
        curveTo(11.2011f, 21.8399f, 11.5046f, 22.0001f, 12f, 22.0001f)
        curveTo(12.4954f, 22.0001f, 12.7989f, 21.8399f, 13.406f, 21.5195f)
        curveTo(15.9372f, 20.1836f, 21f, 16.8086f, 21f, 11.1835f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16.0001f)
        curveTo(12.1396f, 16.0001f, 12.2694f, 15.9365f, 12.5289f, 15.8093f)
        lineTo(14.6152f, 14.7869f)
        curveTo(15.5384f, 14.3345f, 16f, 14.1083f, 16f, 13.7501f)
        verticalLineTo(9.25012f)
        moveTo(12f, 16.0001f)
        curveTo(11.8604f, 16.0001f, 11.7306f, 15.9365f, 11.4711f, 15.8093f)
        lineTo(9.38478f, 14.7869f)
        curveTo(8.4616f, 14.3345f, 8f, 14.1083f, 8f, 13.7501f)
        verticalLineTo(9.25012f)
        moveTo(12f, 16.0001f)
        verticalLineTo(11.5001f)
        moveTo(16f, 9.25012f)
        curveTo(16f, 8.89191f, 15.5384f, 8.6657f, 14.6152f, 8.2133f)
        lineTo(12.5289f, 7.19092f)
        curveTo(12.2694f, 7.06372f, 12.1396f, 7.00012f, 12f, 7.00012f)
        curveTo(11.8604f, 7.00012f, 11.7306f, 7.06372f, 11.4711f, 7.19092f)
        lineTo(9.38478f, 8.2133f)
        curveTo(8.46159f, 8.6657f, 8f, 8.89191f, 8f, 9.25012f)
        moveTo(16f, 9.25012f)
        curveTo(16f, 9.60834f, 15.5384f, 9.83454f, 14.6152f, 10.2869f)
        lineTo(12.5289f, 11.3093f)
        curveTo(12.2694f, 11.4365f, 12.1396f, 11.5001f, 12f, 11.5001f)
        moveTo(8f, 9.25012f)
        curveTo(8f, 9.60834f, 8.46159f, 9.83454f, 9.38478f, 10.2869f)
        lineTo(11.4711f, 11.3093f)
        curveTo(11.7306f, 11.4365f, 11.8604f, 11.5001f, 12f, 11.5001f)
        }
        }.build()

        return _shieldBlockchain!!
    }

private var _shieldBlockchain: ImageVector? = null
