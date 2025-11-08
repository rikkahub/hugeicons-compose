package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NoteEdit: ImageVector
    get() {
        if (_noteEdit != null) {
            return _noteEdit!!
        }
        _noteEdit = ImageVector.Builder(
            name = "NoteEdit",
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
        moveTo(19f, 12f)
        verticalLineTo(10.5f)
        curveTo(19f, 7.20017f, 19f, 5.55025f, 17.9749f, 4.52512f)
        curveTo(16.9497f, 3.5f, 15.2998f, 3.5f, 12f, 3.5f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 3.5f, 5.05025f, 3.5f, 4.02513f, 4.52513f)
        curveTo(3f, 5.55025f, 3f, 7.20017f, 3f, 10.5f)
        verticalLineTo(15f)
        curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
        curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
        horizontalLineTo(11f)
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
        moveTo(15.7367f, 21.6527f)
        lineTo(14f, 22f)
        lineTo(14.3473f, 20.2633f)
        curveTo(14.4179f, 19.9106f, 14.5913f, 19.5866f, 14.8456f, 19.3323f)
        lineTo(18.9111f, 15.2668f)
        curveTo(19.2668f, 14.9111f, 19.8437f, 14.9111f, 20.1995f, 15.2668f)
        lineTo(20.7332f, 15.8005f)
        curveTo(21.0889f, 16.1563f, 21.0889f, 16.7332f, 20.7332f, 17.0889f)
        lineTo(16.6677f, 21.1544f)
        curveTo(16.4134f, 21.4087f, 16.0894f, 21.5821f, 15.7367f, 21.6527f)
        }
        }.build()

        return _noteEdit!!
    }

private var _noteEdit: ImageVector? = null
