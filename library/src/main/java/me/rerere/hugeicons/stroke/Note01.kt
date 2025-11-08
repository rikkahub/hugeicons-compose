package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Note01: ImageVector
    get() {
        if (_note01 != null) {
            return _note01!!
        }
        _note01 = ImageVector.Builder(
            name = "Note01",
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
        moveTo(16.5f, 2f)
        verticalLineTo(5f)
        moveTo(7.5f, 2f)
        verticalLineTo(5f)
        moveTo(12f, 2f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 3.5f)
        horizontalLineTo(11f)
        curveTo(7.70017f, 3.5f, 6.05025f, 3.5f, 5.02513f, 4.52513f)
        curveTo(4f, 5.55025f, 4f, 7.20017f, 4f, 10.5f)
        verticalLineTo(15f)
        curveTo(4f, 18.2998f, 4f, 19.9497f, 5.02513f, 20.9749f)
        curveTo(6.05025f, 22f, 7.70017f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.2998f, 22f, 17.9497f, 22f, 18.9749f, 20.9749f)
        curveTo(20f, 19.9497f, 20f, 18.2998f, 20f, 15f)
        verticalLineTo(10.5f)
        curveTo(20f, 7.20017f, 20f, 5.55025f, 18.9749f, 4.52512f)
        curveTo(17.9497f, 3.5f, 16.2998f, 3.5f, 13f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        horizontalLineTo(12f)
        moveTo(8f, 11f)
        horizontalLineTo(16f)
        }
        }.build()

        return _note01!!
    }

private var _note01: ImageVector? = null
