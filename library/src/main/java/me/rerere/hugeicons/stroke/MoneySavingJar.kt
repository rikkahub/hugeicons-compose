package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneySavingJar: ImageVector
    get() {
        if (_moneySavingJar != null) {
            return _moneySavingJar!!
        }
        _moneySavingJar = ImageVector.Builder(
            name = "MoneySavingJar",
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
        moveTo(19.5f, 16f)
        verticalLineTo(12.0059f)
        curveTo(19.5f, 10.5195f, 19.5f, 9.77627f, 19.2444f, 9.09603f)
        curveTo(18.9888f, 8.4158f, 18.4994f, 7.85648f, 17.5206f, 6.73784f)
        lineTo(16f, 5f)
        horizontalLineTo(8f)
        lineTo(6.47939f, 6.73784f)
        curveTo(5.50058f, 7.85648f, 5.01118f, 8.4158f, 4.75559f, 9.09603f)
        curveTo(4.5f, 9.77627f, 4.5f, 10.5195f, 4.5f, 12.0059f)
        verticalLineTo(16f)
        curveTo(4.5f, 18.8284f, 4.5f, 20.2426f, 5.37868f, 21.1213f)
        curveTo(6.25736f, 22f, 7.67157f, 22f, 10.5f, 22f)
        horizontalLineTo(13.5f)
        curveTo(16.3284f, 22f, 17.7426f, 22f, 18.6213f, 21.1213f)
        curveTo(19.5f, 20.2426f, 19.5f, 18.8284f, 19.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 15.6831f)
        curveTo(9.5f, 16.9125f, 11.3539f, 17.9204f, 13.1325f, 17.3553f)
        curveTo(14.9112f, 16.7901f, 14.6497f, 15.1248f, 14.0463f, 14.4708f)
        curveTo(13.4429f, 13.8169f, 12.555f, 13.9265f, 11.5399f, 13.8751f)
        curveTo(9.25873f, 13.7594f, 9.09769f, 11.5722f, 10.9447f, 10.7069f)
        curveTo(12.2997f, 10.072f, 14.0379f, 10.8862f, 14.2381f, 12f)
        moveTo(11.971f, 9.5f)
        verticalLineTo(10.4777f)
        moveTo(11.971f, 17.7204f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 2f)
        horizontalLineTo(16.5f)
        curveTo(16.9659f, 2f, 17.1989f, 2f, 17.3827f, 2.07612f)
        curveTo(17.6277f, 2.17761f, 17.8224f, 2.37229f, 17.9239f, 2.61732f)
        curveTo(18f, 2.80109f, 18f, 3.03406f, 18f, 3.5f)
        curveTo(18f, 3.96594f, 18f, 4.19891f, 17.9239f, 4.38268f)
        curveTo(17.8224f, 4.62771f, 17.6277f, 4.82239f, 17.3827f, 4.92388f)
        curveTo(17.1989f, 5f, 16.9659f, 5f, 16.5f, 5f)
        horizontalLineTo(7.5f)
        curveTo(7.03406f, 5f, 6.80109f, 5f, 6.61732f, 4.92388f)
        curveTo(6.37229f, 4.82239f, 6.17761f, 4.62771f, 6.07612f, 4.38268f)
        curveTo(6f, 4.19891f, 6f, 3.96594f, 6f, 3.5f)
        curveTo(6f, 3.03406f, 6f, 2.80109f, 6.07612f, 2.61732f)
        curveTo(6.17761f, 2.37229f, 6.37229f, 2.17761f, 6.61732f, 2.07612f)
        curveTo(6.80109f, 2f, 7.03406f, 2f, 7.5f, 2f)
        }
        }.build()

        return _moneySavingJar!!
    }

private var _moneySavingJar: ImageVector? = null
