package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cafe: ImageVector
    get() {
        if (_cafe != null) {
            return _cafe!!
        }
        _cafe = ImageVector.Builder(
            name = "Cafe",
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
        moveTo(18f, 7.79197f)
        curveTo(18.883f, 7.40618f, 19.5f, 6.52513f, 19.5f, 5.5f)
        lineTo(18f, 3f)
        horizontalLineTo(6f)
        lineTo(4.5f, 5.5f)
        curveTo(4.5f, 6.52513f, 5.11705f, 7.40618f, 6f, 7.79197f)
        moveTo(18f, 7.79197f)
        curveTo(17.6938f, 7.92577f, 17.3556f, 8f, 17f, 8f)
        curveTo(15.6193f, 8f, 14.5f, 6.88067f, 14.5f, 5.5f)
        curveTo(14.5f, 6.88067f, 13.3807f, 8f, 12f, 8f)
        curveTo(10.6193f, 8f, 9.5f, 6.88067f, 9.5f, 5.5f)
        curveTo(9.5f, 6.88067f, 8.38072f, 8f, 7f, 8f)
        curveTo(6.64445f, 8f, 6.30623f, 7.92577f, 6f, 7.79197f)
        moveTo(18f, 7.79197f)
        verticalLineTo(11f)
        moveTo(6f, 7.79197f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        verticalLineTo(17f)
        moveTo(3f, 17f)
        horizontalLineTo(5f)
        curveTo(6.41421f, 17f, 7.12132f, 17f, 7.56066f, 17.4393f)
        curveTo(8f, 17.8787f, 8f, 18.5858f, 8f, 20f)
        verticalLineTo(21f)
        moveTo(3f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        verticalLineTo(17f)
        moveTo(21f, 17f)
        horizontalLineTo(19f)
        curveTo(17.5858f, 17f, 16.8787f, 17f, 16.4393f, 17.4393f)
        curveTo(16f, 17.8787f, 16f, 18.5858f, 16f, 20f)
        verticalLineTo(21f)
        moveTo(21f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        horizontalLineTo(12f)
        moveTo(17f, 14f)
        horizontalLineTo(12f)
        moveTo(12f, 14f)
        verticalLineTo(21f)
        moveTo(12f, 21f)
        horizontalLineTo(11f)
        moveTo(12f, 21f)
        horizontalLineTo(13f)
        }
        }.build()

        return _cafe!!
    }

private var _cafe: ImageVector? = null
