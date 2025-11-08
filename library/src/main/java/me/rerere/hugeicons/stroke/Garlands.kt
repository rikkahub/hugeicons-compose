package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Garlands: ImageVector
    get() {
        if (_garlands != null) {
            return _garlands!!
        }
        _garlands = ImageVector.Builder(
            name = "Garlands",
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
        moveTo(22.0007f, 3f)
        curveTo(19.8436f, 4.80898f, 16.1699f, 6f, 12.0007f, 6f)
        curveTo(7.83153f, 6f, 4.1579f, 4.80898f, 2.00073f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0007f, 6f)
        verticalLineTo(11f)
        lineTo(12.0007f, 9.5f)
        lineTo(14.0007f, 11f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 4.49976f)
        lineTo(2f, 9.49891f)
        lineTo(4.5f, 8.49976f)
        lineTo(6f, 10.4998f)
        lineTo(7.5f, 5.99976f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.4991f, 4.50171f)
        lineTo(21.9991f, 9.50086f)
        lineTo(19.4991f, 8.50171f)
        lineTo(17.9991f, 10.5017f)
        lineTo(16.4991f, 6.00171f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13f)
        curveTo(19.8428f, 14.809f, 16.1692f, 16f, 12f, 16f)
        curveTo(7.8308f, 16f, 4.15717f, 14.809f, 2f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        verticalLineTo(21f)
        lineTo(12f, 19.5f)
        lineTo(14f, 21f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 14.5f)
        lineTo(2f, 19.4992f)
        lineTo(4.5f, 18.5f)
        lineTo(6f, 20.5f)
        lineTo(7.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 14.5f)
        lineTo(22f, 19.4992f)
        lineTo(19.5f, 18.5f)
        lineTo(18f, 20.5f)
        lineTo(16.5f, 16f)
        }
        }.build()

        return _garlands!!
    }

private var _garlands: ImageVector? = null
