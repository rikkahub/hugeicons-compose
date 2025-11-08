package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3dPrinter: ImageVector
    get() {
        if (_icon3dPrinter != null) {
            return _icon3dPrinter!!
        }
        _icon3dPrinter = ImageVector.Builder(
            name = "Icon3dPrinter",
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
        moveTo(8f, 2f)
        horizontalLineTo(2f)
        verticalLineTo(2.5f)
        curveTo(2f, 3.60457f, 2.89543f, 4.5f, 4f, 4.5f)
        horizontalLineTo(8f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 2f)
        horizontalLineTo(16f)
        verticalLineTo(4.5f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 4.5f, 22f, 3.60457f, 22f, 2.5f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        horizontalLineTo(8f)
        verticalLineTo(10f)
        horizontalLineTo(16f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 13f)
        horizontalLineTo(10.5f)
        lineTo(8f, 10f)
        horizontalLineTo(16f)
        lineTo(13.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 13f)
        horizontalLineTo(10.5f)
        verticalLineTo(14.7574f)
        curveTo(10.5f, 15.553f, 10.8161f, 16.3161f, 11.3787f, 16.8787f)
        lineTo(12f, 17.5f)
        lineTo(12.6213f, 16.8787f)
        curveTo(13.1839f, 16.3161f, 13.5f, 15.553f, 13.5f, 14.7574f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(10f)
        curveTo(11.1046f, 22f, 12f, 21.1046f, 12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 5f)
        verticalLineTo(5.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7.5f)
        verticalLineTo(7.51f)
        }
        }.build()

        return _icon3dPrinter!!
    }

private var _icon3dPrinter: ImageVector? = null
