package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NoteRemove: ImageVector
    get() {
        if (_noteRemove != null) {
            return _noteRemove!!
        }
        _noteRemove = ImageVector.Builder(
            name = "NoteRemove",
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
        moveTo(15.5f, 2f)
        verticalLineTo(5f)
        moveTo(6.5f, 2f)
        verticalLineTo(5f)
        moveTo(11f, 2f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        verticalLineTo(10.5f)
        curveTo(19f, 7.20017f, 19f, 5.55025f, 17.9749f, 4.52512f)
        curveTo(16.9497f, 3.5f, 15.2998f, 3.5f, 12f, 3.5f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 3.5f, 5.05025f, 3.5f, 4.02513f, 4.52513f)
        curveTo(3f, 5.55025f, 3f, 7.20017f, 3f, 10.5f)
        verticalLineTo(15f)
        curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
        curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(11f)
        moveTo(7f, 11f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17f)
        lineTo(18.5f, 19.5f)
        moveTo(18.5f, 19.5f)
        lineTo(16f, 22f)
        moveTo(18.5f, 19.5f)
        lineTo(21f, 22f)
        moveTo(18.5f, 19.5f)
        lineTo(16f, 17f)
        }
        }.build()

        return _noteRemove!!
    }

private var _noteRemove: ImageVector? = null
