package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MinusPlusCircle02: ImageVector
    get() {
        if (_minusPlusCircle02 != null) {
            return _minusPlusCircle02!!
        }
        _minusPlusCircle02 = ImageVector.Builder(
            name = "MinusPlusCircle02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 8f)
            lineTo(8f, 16f)
            moveTo(14.5f, 16f)
            verticalLineTo(14.5f)
            moveTo(14.5f, 14.5f)
            verticalLineTo(13f)
            moveTo(14.5f, 14.5f)
            horizontalLineTo(13f)
            moveTo(14.5f, 14.5f)
            horizontalLineTo(16f)
            moveTo(8f, 9.5f)
            horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }
        }.build()

        return _minusPlusCircle02!!
    }

private var _minusPlusCircle02: ImageVector? = null
