package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = ImageVector.Builder(
            name = "Npm",
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
        moveTo(2.5f, 12.0001f)
        curveTo(2.5f, 7.52178f, 2.5f, 5.28261f, 3.89124f, 3.89136f)
        curveTo(5.28249f, 2.50012f, 7.52166f, 2.50012f, 12f, 2.50012f)
        curveTo(16.4783f, 2.50012f, 18.7175f, 2.50012f, 20.1088f, 3.89136f)
        curveTo(21.5f, 5.28261f, 21.5f, 7.52178f, 21.5f, 12.0001f)
        curveTo(21.5f, 16.4785f, 21.5f, 18.7176f, 20.1088f, 20.1089f)
        curveTo(18.7175f, 21.5001f, 16.4783f, 21.5001f, 12f, 21.5001f)
        curveTo(7.52166f, 21.5001f, 5.28249f, 21.5001f, 3.89124f, 20.1089f)
        curveTo(2.5f, 18.7176f, 2.5f, 16.4785f, 2.5f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7.00012f)
        horizontalLineTo(16f)
        curveTo(16.5523f, 7.00012f, 17f, 7.44784f, 17f, 8.00012f)
        verticalLineTo(16.0001f)
        curveTo(17f, 16.5524f, 16.5523f, 17.0001f, 16f, 17.0001f)
        horizontalLineTo(14.5f)
        verticalLineTo(9.50012f)
        horizontalLineTo(12f)
        verticalLineTo(17.0001f)
        horizontalLineTo(8f)
        curveTo(7.44772f, 17.0001f, 7f, 16.5524f, 7f, 16.0001f)
        verticalLineTo(8.00012f)
        curveTo(7f, 7.44784f, 7.44772f, 7.00012f, 8f, 7.00012f)
        }
        }.build()

        return _npm!!
    }

private var _npm: ImageVector? = null
