package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Note04: ImageVector
    get() {
        if (_note04 != null) {
            return _note04!!
        }
        _note04 = ImageVector.Builder(
            name = "Note04",
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
        moveTo(5.49994f, 10.5f)
        verticalLineTo(13.5f)
        curveTo(5.49994f, 17.2712f, 5.49994f, 19.1569f, 6.67151f, 20.3284f)
        curveTo(7.84308f, 21.5f, 9.7287f, 21.5f, 13.4999f, 21.5f)
        curveTo(17.2712f, 21.5f, 19.1568f, 21.5f, 20.3284f, 20.3284f)
        curveTo(21.4999f, 19.1569f, 21.4999f, 17.2712f, 21.4999f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(21.4999f, 6.72876f, 21.4999f, 4.84315f, 20.3284f, 3.67157f)
        curveTo(19.1568f, 2.5f, 17.2712f, 2.5f, 13.4999f, 2.5f)
        curveTo(9.7287f, 2.5f, 7.84308f, 2.5f, 6.67151f, 3.67158f)
        curveTo(5.49994f, 4.84315f, 5.49994f, 6.72877f, 5.49994f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 10.5f)
        lineTo(4f, 10.5f)
        curveTo(3.17157f, 10.5f, 2.5f, 9.82843f, 2.5f, 9f)
        curveTo(2.5f, 8.17157f, 3.17157f, 7.5f, 4f, 7.5f)
        lineTo(7.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 17.5f)
        lineTo(4f, 17.5f)
        curveTo(3.17157f, 17.5f, 2.5f, 16.8284f, 2.5f, 16f)
        curveTo(2.5f, 15.1716f, 3.17157f, 14.5f, 4f, 14.5f)
        lineTo(7.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 10.5f)
        horizontalLineTo(15f)
        moveTo(11f, 6.5f)
        horizontalLineTo(17.5f)
        }
        }.build()

        return _note04!!
    }

private var _note04: ImageVector? = null
