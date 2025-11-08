package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = ImageVector.Builder(
            name = "Tram",
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
        moveTo(5f, 2f)
        horizontalLineTo(14f)
        moveTo(19f, 2f)
        horizontalLineTo(14f)
        moveTo(14f, 2f)
        lineTo(12f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 20f)
        lineTo(7f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 13f)
        verticalLineTo(12f)
        curveTo(5f, 8.70017f, 5f, 7.05025f, 6.02513f, 6.02513f)
        curveTo(7.05025f, 5f, 8.70017f, 5f, 12f, 5f)
        curveTo(15.2998f, 5f, 16.9497f, 5f, 17.9749f, 6.02513f)
        curveTo(19f, 7.05025f, 19f, 8.70017f, 19f, 12f)
        verticalLineTo(13f)
        curveTo(19f, 16.2998f, 19f, 17.9497f, 17.9749f, 18.9749f)
        curveTo(16.9497f, 20f, 15.2998f, 20f, 12f, 20f)
        curveTo(8.70017f, 20f, 7.05025f, 20f, 6.02513f, 18.9749f)
        curveTo(5f, 17.9497f, 5f, 16.2998f, 5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14f)
        curveTo(5f, 14f, 8.26667f, 15f, 12f, 15f)
        curveTo(15.7333f, 15f, 19f, 14f, 19f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 17f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 8f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 17f)
        horizontalLineTo(7.5f)
        }
        }.build()

        return _tram!!
    }

private var _tram: ImageVector? = null
