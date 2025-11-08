package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinFlashdisk: ImageVector
    get() {
        if (_bitcoinFlashdisk != null) {
            return _bitcoinFlashdisk!!
        }
        _bitcoinFlashdisk = ImageVector.Builder(
            name = "BitcoinFlashdisk",
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
        moveTo(10.5088f, 22f)
        curveTo(9.57782f, 22f, 9.11235f, 22f, 8.72528f, 21.9231f)
        curveTo(7.13574f, 21.6075f, 5.89317f, 20.3671f, 5.57699f, 18.7804f)
        curveTo(5.5f, 18.394f, 5.5f, 17.9293f, 5.5f, 17f)
        verticalLineTo(11.5f)
        curveTo(5.5f, 9.61438f, 5.5f, 8.67157f, 6.08681f, 8.08579f)
        curveTo(6.67362f, 7.5f, 7.61808f, 7.5f, 9.507f, 7.5f)
        horizontalLineTo(11.5105f)
        curveTo(13.3994f, 7.5f, 14.3439f, 7.5f, 14.9307f, 8.08579f)
        curveTo(15.3355f, 8.48987f, 15.4611f, 9.06385f, 15.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.625f, 20.5f)
        lineTo(13.625f, 14.5f)
        moveTo(15.5f, 14.5f)
        verticalLineTo(13f)
        moveTo(15.5f, 22f)
        verticalLineTo(20.5f)
        moveTo(13.625f, 17.5f)
        horizontalLineTo(17.375f)
        moveTo(17.375f, 17.5f)
        curveTo(17.9963f, 17.5f, 18.5f, 18.0037f, 18.5f, 18.625f)
        verticalLineTo(19.375f)
        curveTo(18.5f, 19.9963f, 17.9963f, 20.5f, 17.375f, 20.5f)
        horizontalLineTo(12.5f)
        moveTo(17.375f, 17.5f)
        curveTo(17.9963f, 17.5f, 18.5f, 16.9963f, 18.5f, 16.375f)
        verticalLineTo(15.625f)
        curveTo(18.5f, 15.0037f, 17.9963f, 14.5f, 17.375f, 14.5f)
        horizontalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7.5f)
        verticalLineTo(5.5f)
        curveTo(14f, 4.09554f, 14f, 3.39331f, 13.6629f, 2.88886f)
        curveTo(13.517f, 2.67048f, 13.3295f, 2.48298f, 13.1111f, 2.33706f)
        curveTo(12.6067f, 2f, 11.9045f, 2f, 10.5f, 2f)
        curveTo(9.09554f, 2f, 8.39331f, 2f, 7.88886f, 2.33706f)
        curveTo(7.67048f, 2.48298f, 7.48298f, 2.67048f, 7.33706f, 2.88886f)
        curveTo(7f, 3.39331f, 7f, 4.09554f, 7f, 5.5f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 4.5f)
        horizontalLineTo(11f)
        }
        }.build()

        return _bitcoinFlashdisk!!
    }

private var _bitcoinFlashdisk: ImageVector? = null
