package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mails: ImageVector
    get() {
        if (_mails != null) {
            return _mails!!
        }
        _mails = ImageVector.Builder(
            name = "Mails",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13f, 3f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 3f, 20.2426f, 3f, 21.1213f, 3.87868f)
            curveTo(22f, 4.75736f, 22f, 6.17157f, 22f, 9f)
            curveTo(22f, 11.8284f, 22f, 13.2426f, 21.1213f, 14.1213f)
            curveTo(20.2426f, 15f, 18.8284f, 15f, 16f, 15f)
            horizontalLineTo(13f)
            curveTo(10.1716f, 15f, 8.75736f, 15f, 7.87868f, 14.1213f)
            curveTo(7f, 13.2426f, 7f, 11.8284f, 7f, 9f)
            curveTo(7f, 6.17157f, 7f, 4.75736f, 7.87868f, 3.87868f)
            curveTo(8.75736f, 3f, 10.1716f, 3f, 13f, 3f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 17.9358f)
            curveTo(16.9036f, 18.9318f, 16.6857f, 19.6022f, 16.1933f, 20.1025f)
            curveTo(15.3102f, 21f, 13.8888f, 21f, 11.0459f, 21f)
            horizontalLineTo(8.0306f)
            curveTo(5.18775f, 21f, 3.76632f, 21f, 2.88316f, 20.1025f)
            curveTo(2f, 19.2051f, 2f, 17.7606f, 2f, 14.8717f)
            curveTo(2f, 11.9828f, 2f, 10.5383f, 2.88316f, 9.64085f)
            curveTo(3.18449f, 9.33464f, 3.54848f, 9.1329f, 4.0102f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.7585f, 6.12671f)
            lineTo(17.587f, 8.31597f)
            curveTo(16.083f, 9.1053f, 15.331f, 9.49996f, 14.5f, 9.49996f)
            curveTo(13.6691f, 9.49996f, 12.917f, 9.1053f, 11.413f, 8.31597f)
            lineTo(7.24152f, 6.12671f)
        }
        }.build()

        return _mails!!
    }

private var _mails: ImageVector? = null
