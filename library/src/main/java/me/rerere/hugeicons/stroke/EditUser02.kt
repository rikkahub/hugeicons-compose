package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EditUser02: ImageVector
    get() {
        if (_editUser02 != null) {
            return _editUser02!!
        }
        _editUser02 = ImageVector.Builder(
            name = "EditUser02",
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
        moveTo(14f, 8.5f)
        curveTo(14f, 5.73858f, 11.7614f, 3.5f, 9f, 3.5f)
        curveTo(6.23858f, 3.5f, 4f, 5.73858f, 4f, 8.5f)
        curveTo(4f, 11.2614f, 6.23858f, 13.5f, 9f, 13.5f)
        curveTo(11.7614f, 13.5f, 14f, 11.2614f, 14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20.5f)
        curveTo(16f, 16.634f, 12.866f, 13.5f, 9f, 13.5f)
        curveTo(5.13401f, 13.5f, 2f, 16.634f, 2f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.6887f, 7.93395f)
        lineTo(21.0661f, 7.31132f)
        curveTo(20.651f, 6.89623f, 19.978f, 6.89623f, 19.5629f, 7.31131f)
        lineTo(16.4211f, 10.564f)
        curveTo(16.151f, 10.8437f, 16f, 11.2173f, 16f, 11.6061f)
        verticalLineTo(13f)
        horizontalLineTo(17.3939f)
        curveTo(17.7827f, 13f, 18.1563f, 12.849f, 18.436f, 12.5789f)
        lineTo(21.6887f, 9.43711f)
        curveTo(22.1038f, 9.02202f, 22.1038f, 8.34903f, 21.6887f, 7.93395f)
        }
        }.build()

        return _editUser02!!
    }

private var _editUser02: ImageVector? = null
