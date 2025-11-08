package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Honey02: ImageVector
    get() {
        if (_honey02 != null) {
            return _honey02!!
        }
        _honey02 = ImageVector.Builder(
            name = "Honey02",
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
        moveTo(7.44828f, 3.5f)
        horizontalLineTo(6f)
        moveTo(20f, 3.5f)
        horizontalLineTo(11.5f)
        moveTo(11.5f, 2f)
        verticalLineTo(5f)
        moveTo(7.44828f, 2f)
        verticalLineTo(5f)
        moveTo(9.5f, 1f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6f, 9f)
        lineTo(13.8963f, 9.36014f)
        curveTo(14.938f, 10.626f, 15.4588f, 11.259f, 15.7294f, 12.0089f)
        curveTo(16f, 12.7589f, 16f, 13.5695f, 16f, 15.1906f)
        verticalLineTo(18.3333f)
        curveTo(16f, 20.5332f, 16f, 21.6332f, 15.2971f, 22.3166f)
        curveTo(14.5941f, 23f, 13.4627f, 23f, 11.2f, 23f)
        horizontalLineTo(8.8f)
        curveTo(6.53726f, 23f, 5.40589f, 23f, 4.70294f, 22.3166f)
        curveTo(4f, 21.6332f, 4f, 20.5332f, 4f, 18.3333f)
        verticalLineTo(15.1906f)
        curveTo(4f, 13.5695f, 4f, 12.7589f, 4.27058f, 12.0089f)
        curveTo(4.54117f, 11.259f, 5.062f, 10.626f, 6.10366f, 9.36014f)
        lineTo(6.4f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15f)
        horizontalLineTo(16f)
        }
        }.build()

        return _honey02!!
    }

private var _honey02: ImageVector? = null
