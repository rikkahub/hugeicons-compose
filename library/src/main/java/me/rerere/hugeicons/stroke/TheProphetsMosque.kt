package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TheProphetsMosque: ImageVector
    get() {
        if (_theProphetsMosque != null) {
            return _theProphetsMosque!!
        }
        _theProphetsMosque = ImageVector.Builder(
            name = "TheProphetsMosque",
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
        moveTo(3f, 22f)
        verticalLineTo(19.5f)
        curveTo(3f, 17.4317f, 3.34533f, 17f, 5f, 17f)
        horizontalLineTo(17f)
        curveTo(18.6547f, 17f, 19f, 17.4317f, 19f, 19.5f)
        verticalLineTo(22f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5125f, 6f)
        curveTo(15.9698f, 4f, 18.3389f, 3f, 19f, 2f)
        curveTo(19.6611f, 3f, 22.0302f, 4f, 20.4875f, 6f)
        horizontalLineTo(17.5125f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 6f)
        lineTo(17f, 17f)
        moveTo(17f, 22f)
        horizontalLineTo(21f)
        lineTo(20.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0006f, 8f)
        curveTo(12.984f, 10.25f, 16.9992f, 11f, 16.9992f, 17f)
        horizontalLineTo(5f)
        curveTo(5f, 11f, 9.01516f, 10.25f, 10.9986f, 8f)
        }
        }.build()

        return _theProphetsMosque!!
    }

private var _theProphetsMosque: ImageVector? = null
