package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapPinpoint01: ImageVector
    get() {
        if (_mapPinpoint01 != null) {
            return _mapPinpoint01!!
        }
        _mapPinpoint01 = ImageVector.Builder(
            name = "MapPinpoint01",
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
        moveTo(14.5f, 10f)
        curveTo(14.0697f, 8.55426f, 12.5855f, 7.5f, 11f, 7.5f)
        curveTo(9.067f, 7.5f, 7.5f, 9.067f, 7.5f, 11f)
        curveTo(7.5f, 12.7632f, 8.80385f, 14.2574f, 10.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9504f, 10f)
        curveTo(19.4697f, 5.53446f, 15.5596f, 2f, 11f, 2f)
        curveTo(6.12944f, 2f, 2f, 6.03298f, 2f, 10.9258f)
        curveTo(2f, 15.9137f, 6.2039f, 19.3616f, 10.073f, 21.7567f)
        curveTo(10.3555f, 21.9162f, 10.675f, 22f, 11f, 22f)
        curveTo(11.325f, 22f, 11.6445f, 21.9162f, 11.927f, 21.7567f)
        curveTo(12.1816f, 21.6009f, 12.4376f, 21.4403f, 12.6937f, 21.2748f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 12f)
        curveTo(19.9353f, 12f, 22f, 14.0165f, 22f, 16.4629f)
        curveTo(22f, 18.9482f, 19.9017f, 20.6924f, 17.9635f, 21.8783f)
        curveTo(17.8223f, 21.9581f, 17.6625f, 22f, 17.5f, 22f)
        curveTo(17.3375f, 22f, 17.1777f, 21.9581f, 17.0365f, 21.8783f)
        curveTo(15.1019f, 20.6808f, 13f, 18.9568f, 13f, 16.4629f)
        curveTo(13f, 14.0165f, 15.0647f, 12f, 17.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 16.5f)
        horizontalLineTo(17.509f)
        }
        }.build()

        return _mapPinpoint01!!
    }

private var _mapPinpoint01: ImageVector? = null
