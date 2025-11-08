package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDiagonal: ImageVector
    get() {
        if (_arrowDiagonal != null) {
            return _arrowDiagonal!!
        }
        _arrowDiagonal = ImageVector.Builder(
            name = "ArrowDiagonal",
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
        moveTo(16.5001f, 3.26621f)
        curveTo(17.3445f, 3.25421f, 20.141f, 2.67328f, 20.7339f, 3.26621f)
        curveTo(21.3268f, 3.85913f, 20.7459f, 6.65559f, 20.7339f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.26631f, 16.5f)
        curveTo(3.25431f, 17.3444f, 2.67338f, 20.1409f, 3.26631f, 20.7338f)
        curveTo(3.85923f, 21.3267f, 6.65569f, 20.7458f, 7.5001f, 20.7338f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.89561f, 20.0577f)
        lineTo(20.1047f, 3.94238f)
        }
        }.build()

        return _arrowDiagonal!!
    }

private var _arrowDiagonal: ImageVector? = null
