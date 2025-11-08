package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bacteria: ImageVector
    get() {
        if (_bacteria != null) {
            return _bacteria!!
        }
        _bacteria = ImageVector.Builder(
            name = "Bacteria",
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
        moveTo(6f, 12.5f)
        lineTo(6.20943f, 12.735f)
        curveTo(6.59836f, 13.1714f, 7.25402f, 13.052f, 7.5f, 12.5f)
        curveTo(7.74598f, 11.948f, 8.40164f, 11.8286f, 8.79057f, 12.265f)
        lineTo(9f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8413f, 18f)
        lineTo(15.9521f, 17.6549f)
        curveTo(16.1579f, 17.014f, 15.6742f, 16.4273f, 15f, 16.5f)
        curveTo(14.3258f, 16.5727f, 13.8421f, 15.986f, 14.0479f, 15.3451f)
        lineTo(14.1587f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.009f, 13f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00896f, 17f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00896f, 8f)
        horizontalLineTo(8f)
        }
        }.build()

        return _bacteria!!
    }

private var _bacteria: ImageVector? = null
