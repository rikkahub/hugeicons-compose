package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Arrange: ImageVector
    get() {
        if (_arrange != null) {
            return _arrange!!
        }
        _arrange = ImageVector.Builder(
            name = "Arrange",
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
        moveTo(3f, 4.5f)
        curveTo(3f, 3.67157f, 3.67157f, 3f, 4.5f, 3f)
        horizontalLineTo(6.5f)
        curveTo(7.32843f, 3f, 8f, 3.67157f, 8f, 4.5f)
        verticalLineTo(6.5f)
        curveTo(8f, 7.32843f, 7.32843f, 8f, 6.5f, 8f)
        horizontalLineTo(4.5f)
        curveTo(3.67157f, 8f, 3f, 7.32843f, 3f, 6.5f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17.5f)
        curveTo(3f, 16.6716f, 3.67157f, 16f, 4.5f, 16f)
        horizontalLineTo(6.5f)
        curveTo(7.32843f, 16f, 8f, 16.6716f, 8f, 17.5f)
        verticalLineTo(19.5f)
        curveTo(8f, 20.3284f, 7.32843f, 21f, 6.5f, 21f)
        horizontalLineTo(4.5f)
        curveTo(3.67157f, 21f, 3f, 20.3284f, 3f, 19.5f)
        verticalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00002f, 18.5f)
        horizontalLineTo(21f)
        moveTo(16f, 5.5f)
        horizontalLineTo(8.00002f)
        moveTo(16.3235f, 7.67649f)
        lineTo(7.64868f, 16.3513f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4.5f)
        curveTo(16f, 3.67157f, 16.6716f, 3f, 17.5f, 3f)
        horizontalLineTo(19.5f)
        curveTo(20.3284f, 3f, 21f, 3.67157f, 21f, 4.5f)
        verticalLineTo(6.5f)
        curveTo(21f, 7.32843f, 20.3284f, 8f, 19.5f, 8f)
        horizontalLineTo(17.5f)
        curveTo(16.6716f, 8f, 16f, 7.32843f, 16f, 6.5f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        lineTo(19.3883f, 20.0537f)
        curveTo(20.4628f, 19.3213f, 21f, 18.9551f, 21f, 18.5f)
        curveTo(21f, 18.0449f, 20.4628f, 17.6787f, 19.3883f, 16.9463f)
        lineTo(18f, 16f)
        }
        }.build()

        return _arrange!!
    }

private var _arrange: ImageVector? = null
