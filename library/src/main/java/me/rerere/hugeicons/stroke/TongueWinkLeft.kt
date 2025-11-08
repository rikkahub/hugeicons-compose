package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TongueWinkLeft: ImageVector
    get() {
        if (_tongueWinkLeft != null) {
            return _tongueWinkLeft!!
        }
        _tongueWinkLeft = ImageVector.Builder(
            name = "TongueWinkLeft",
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
        moveTo(9f, 8f)
        curveTo(9f, 8f, 10f, 9f, 10f, 10f)
        curveTo(9.25f, 9f, 7.75f, 9f, 7f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.009f, 9f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 14f)
        curveTo(8.91212f, 15.2144f, 10.3643f, 16f, 12f, 16f)
        curveTo(13.6357f, 16f, 15.0879f, 15.2144f, 16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        verticalLineTo(17.5f)
        curveTo(10f, 18.6046f, 10.8954f, 19.5f, 12f, 19.5f)
        curveTo(13.1046f, 19.5f, 14f, 18.6046f, 14f, 17.5f)
        verticalLineTo(16f)
        }
        }.build()

        return _tongueWinkLeft!!
    }

private var _tongueWinkLeft: ImageVector? = null
