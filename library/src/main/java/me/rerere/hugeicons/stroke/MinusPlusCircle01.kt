package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MinusPlusCircle01: ImageVector
    get() {
        if (_minusPlusCircle01 != null) {
            return _minusPlusCircle01!!
        }
        _minusPlusCircle01 = ImageVector.Builder(
            name = "MinusPlusCircle01",
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
        moveTo(12f, 16.5f)
        verticalLineTo(10.1364f)
        moveTo(15.5f, 13.3182f)
        horizontalLineTo(8.5f)
        moveTo(15.5f, 7.5f)
        horizontalLineTo(8.5f)
        }
        }.build()

        return _minusPlusCircle01!!
    }

private var _minusPlusCircle01: ImageVector? = null
