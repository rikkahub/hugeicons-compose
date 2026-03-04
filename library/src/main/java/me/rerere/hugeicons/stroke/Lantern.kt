package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lantern: ImageVector
    get() {
        if (_lantern != null) {
            return _lantern!!
        }
        _lantern = ImageVector.Builder(
            name = "Lantern",
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
        moveTo(6f, 7.5f)
        curveTo(6.71663f, 5.40983f, 8.72856f, 4f, 10.9947f, 4f)
        horizontalLineTo(13.0053f)
        curveTo(15.2714f, 4f, 17.2834f, 5.40983f, 18f, 7.5f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.5f)
        curveTo(17.2834f, 20.5902f, 15.2714f, 22f, 13.0053f, 22f)
        lineTo(10.9947f, 22f)
        curveTo(8.72855f, 22f, 6.71663f, 20.5902f, 6f, 18.5f)
        lineTo(18f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7.5f)
        horizontalLineTo(5f)
        lineTo(6f, 8.5f)
        moveTo(18f, 7.5f)
        horizontalLineTo(19f)
        lineTo(18f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.5f)
        lineTo(19f, 18.5f)
        lineTo(18f, 17.5f)
        moveTo(6f, 18.5f)
        lineTo(5f, 18.5f)
        lineTo(6f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11f)
        lineTo(22f, 10.5f)
        moveTo(21f, 15f)
        lineTo(22f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11f)
        lineTo(2f, 10.5f)
        moveTo(3f, 15f)
        lineTo(2f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(4f)
        }
        }.build()

        return _lantern!!
    }

private var _lantern: ImageVector? = null
