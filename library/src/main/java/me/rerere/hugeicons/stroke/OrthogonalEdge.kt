package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OrthogonalEdge: ImageVector
    get() {
        if (_orthogonalEdge != null) {
            return _orthogonalEdge!!
        }
        _orthogonalEdge = ImageVector.Builder(
            name = "OrthogonalEdge",
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
        moveTo(8f, 6f)
        horizontalLineTo(9.78046f)
        curveTo(11.7968f, 6f, 12.8049f, 6f, 13.3136f, 6.24139f)
        curveTo(14.5399f, 6.82331f, 15.0779f, 8.27746f, 14.5255f, 9.51737f)
        curveTo(14.2963f, 10.0317f, 13.5309f, 10.6878f, 12f, 12f)
        curveTo(10.4691f, 13.3122f, 9.70366f, 13.9683f, 9.47452f, 14.4826f)
        curveTo(8.92213f, 15.7225f, 9.46006f, 17.1767f, 10.6864f, 17.7586f)
        curveTo(11.1951f, 18f, 12.2032f, 18f, 14.2195f, 18f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 6f)
        curveTo(2f, 7.65685f, 3.34315f, 9f, 5f, 9f)
        curveTo(6.65685f, 9f, 8f, 7.65685f, 8f, 6f)
        curveTo(8f, 4.34315f, 6.65685f, 3f, 5f, 3f)
        curveTo(3.34315f, 3f, 2f, 4.34315f, 2f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18f)
        curveTo(16f, 19.6569f, 17.3431f, 21f, 19f, 21f)
        curveTo(20.6569f, 21f, 22f, 19.6569f, 22f, 18f)
        curveTo(22f, 16.3431f, 20.6569f, 15f, 19f, 15f)
        curveTo(17.3431f, 15f, 16f, 16.3431f, 16f, 18f)
        }
        }.build()

        return _orthogonalEdge!!
    }

private var _orthogonalEdge: ImageVector? = null
