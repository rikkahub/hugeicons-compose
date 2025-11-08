package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = ImageVector.Builder(
            name = "Football",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7077f, 9.34893f)
        curveTo(11.882f, 9.21702f, 12.118f, 9.21702f, 12.2923f, 9.34893f)
        lineTo(14.545f, 11.054f)
        curveTo(14.7193f, 11.1859f, 14.7922f, 11.4197f, 14.7256f, 11.6332f)
        lineTo(13.8652f, 14.3921f)
        curveTo(13.7986f, 14.6055f, 13.6077f, 14.75f, 13.3923f, 14.75f)
        horizontalLineTo(10.6077f)
        curveTo(10.3923f, 14.75f, 10.2014f, 14.6055f, 10.1348f, 14.3921f)
        lineTo(9.27437f, 11.6332f)
        curveTo(9.20781f, 11.4197f, 9.28073f, 11.1859f, 9.45499f, 11.054f)
        lineTo(11.7077f, 9.34893f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(5f)
        moveTo(15f, 11f)
        lineTo(19f, 9.5f)
        moveTo(14f, 15f)
        lineTo(16f, 18f)
        moveTo(10f, 14.5f)
        lineTo(8f, 17f)
        moveTo(9f, 11.5f)
        lineTo(5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2.5f)
        lineTo(12.0165f, 4.62241f)
        lineTo(15f, 2.5f)
        moveTo(2f, 12.7998f)
        lineTo(5.19655f, 10.4388f)
        lineTo(3.55548f, 6.72045f)
        moveTo(19.4703f, 18.8531f)
        lineTo(15.6158f, 18.1555f)
        lineTo(14.2655f, 22f)
        moveTo(20.0298f, 6.19586f)
        lineTo(18.8035f, 9.38978f)
        lineTo(22f, 11.7507f)
        moveTo(8.00992f, 21.4059f)
        lineTo(8.05142f, 17.1665f)
        lineTo(4.00331f, 17.21f)
        }
        }.build()

        return _football!!
    }

private var _football: ImageVector? = null
