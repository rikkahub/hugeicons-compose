package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cards01: ImageVector
    get() {
        if (_cards01 != null) {
            return _cards01!!
        }
        _cards01 = ImageVector.Builder(
            name = "Cards01",
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
        moveTo(3f, 11f)
        curveTo(3f, 8.17157f, 3f, 6.75736f, 3.87868f, 5.87868f)
        curveTo(4.75736f, 5f, 6.17157f, 5f, 9f, 5f)
        horizontalLineTo(11f)
        curveTo(13.8284f, 5f, 15.2426f, 5f, 16.1213f, 5.87868f)
        curveTo(17f, 6.75736f, 17f, 8.17157f, 17f, 11f)
        verticalLineTo(16f)
        curveTo(17f, 18.8284f, 17f, 20.2426f, 16.1213f, 21.1213f)
        curveTo(15.2426f, 22f, 13.8284f, 22f, 11f, 22f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 22f, 4.75736f, 22f, 3.87868f, 21.1213f)
        curveTo(3f, 20.2426f, 3f, 18.8284f, 3f, 16f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.04435f, 11.762f)
        lineTo(8.42742f, 11.3048f)
        curveTo(9.15621f, 10.4349f, 9.52061f, 10f, 10f, 10f)
        curveTo(10.4794f, 10f, 10.8438f, 10.4349f, 11.5726f, 11.3048f)
        lineTo(11.9556f, 11.762f)
        curveTo(12.6519f, 12.593f, 13f, 13.0086f, 13f, 13.5f)
        curveTo(13f, 13.9914f, 12.6519f, 14.407f, 11.9556f, 15.238f)
        lineTo(11.5726f, 15.6952f)
        curveTo(10.8438f, 16.5651f, 10.4794f, 17f, 10f, 17f)
        curveTo(9.52061f, 17f, 9.15621f, 16.5651f, 8.42742f, 15.6952f)
        lineTo(8.04435f, 15.238f)
        curveTo(7.34812f, 14.407f, 7f, 13.9914f, 7f, 13.5f)
        curveTo(7f, 13.0086f, 7.34812f, 12.593f, 8.04435f, 11.762f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9244f, 19f)
        curveTo(18.0202f, 18.3874f, 18.3929f, 17.0406f, 19.1383f, 14.3469f)
        lineTo(20.1925f, 10.5375f)
        curveTo(20.938f, 7.84378f, 21.3107f, 6.49694f, 20.678f, 5.4359f)
        curveTo(20.0453f, 4.37485f, 18.6543f, 4.01397f, 15.8724f, 3.2922f)
        lineTo(13.9052f, 2.78183f)
        curveTo(11.1232f, 2.06006f, 9.73225f, 1.69918f, 8.63642f, 2.31177f)
        curveTo(7.85623f, 2.74792f, 7.44258f, 3.55626f, 7f, 4.95786f)
        }
        }.build()

        return _cards01!!
    }

private var _cards01: ImageVector? = null
