package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Select01: ImageVector
    get() {
        if (_select01 != null) {
            return _select01!!
        }
        _select01 = ImageVector.Builder(
            name = "Select01",
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
        verticalLineTo(8f)
        moveTo(2f, 5f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        horizontalLineTo(15f)
        moveTo(12f, 22f)
        horizontalLineTo(15f)
        moveTo(18f, 5f)
        horizontalLineTo(18.5f)
        curveTo(20.433f, 5f, 22f, 6.567f, 22f, 8.5f)
        verticalLineTo(9f)
        moveTo(22f, 18f)
        verticalLineTo(18.5f)
        curveTo(22f, 20.433f, 20.433f, 22f, 18.5f, 22f)
        horizontalLineTo(18f)
        moveTo(9f, 22f)
        horizontalLineTo(8.5f)
        curveTo(6.567f, 22f, 5f, 20.433f, 5f, 18.5f)
        lineTo(5f, 18f)
        moveTo(22f, 12f)
        verticalLineTo(15f)
        moveTo(5f, 12f)
        lineTo(5f, 15f)
        }
        }.build()

        return _select01!!
    }

private var _select01: ImageVector? = null
