package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Calculator01: ImageVector
    get() {
        if (_calculator01 != null) {
            return _calculator01!!
        }
        _calculator01 = ImageVector.Builder(
            name = "Calculator01",
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
        moveTo(3f, 10f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6f)
        lineTo(17f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        verticalLineTo(11f)
        curveTo(21f, 6.75736f, 21f, 4.63604f, 19.682f, 3.31802f)
        curveTo(18.364f, 2f, 16.2426f, 2f, 12f, 2f)
        curveTo(7.75736f, 2f, 5.63604f, 2f, 4.31802f, 3.31802f)
        curveTo(3f, 4.63604f, 3f, 6.75736f, 3f, 11f)
        verticalLineTo(13f)
        curveTo(3f, 17.2426f, 3f, 19.364f, 4.31802f, 20.682f)
        curveTo(5.63604f, 22f, 7.75736f, 22f, 12f, 22f)
        curveTo(16.2426f, 22f, 18.364f, 22f, 19.682f, 20.682f)
        curveTo(21f, 19.364f, 21f, 17.2426f, 21f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        horizontalLineTo(7.52632f)
        moveTo(11.7368f, 14f)
        horizontalLineTo(12.2632f)
        moveTo(16.4737f, 14f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        horizontalLineTo(7.52632f)
        moveTo(11.7368f, 18f)
        horizontalLineTo(12.2632f)
        moveTo(16.4737f, 18f)
        horizontalLineTo(17f)
        }
        }.build()

        return _calculator01!!
    }

private var _calculator01: ImageVector? = null
