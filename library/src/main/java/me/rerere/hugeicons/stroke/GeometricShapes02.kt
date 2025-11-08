package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GeometricShapes02: ImageVector
    get() {
        if (_geometricShapes02 != null) {
            return _geometricShapes02!!
        }
        _geometricShapes02 = ImageVector.Builder(
            name = "GeometricShapes02",
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
        moveTo(11f, 6f)
        horizontalLineTo(18.2763f)
        curveTo(20.5344f, 6f, 21.6635f, 6f, 21.9445f, 6.67836f)
        curveTo(22.2255f, 7.35672f, 21.4271f, 8.1551f, 19.8304f, 9.75184f)
        lineTo(9.75184f, 19.8304f)
        curveTo(8.15509f, 21.4271f, 7.35672f, 22.2255f, 6.67836f, 21.9445f)
        curveTo(6f, 21.6635f, 6f, 20.5344f, 6f, 18.2763f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 12f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 12f, 20.8284f, 12f, 21.4142f, 12.5858f)
        curveTo(22f, 13.1716f, 22f, 14.1144f, 22f, 16f)
        verticalLineTo(17f)
        curveTo(22f, 18.8856f, 22f, 19.8284f, 21.4142f, 20.4142f)
        curveTo(20.8284f, 21f, 19.8856f, 21f, 18f, 21f)
        horizontalLineTo(17f)
        curveTo(15.1144f, 21f, 14.1716f, 21f, 13.5858f, 20.4142f)
        curveTo(13f, 19.8284f, 13f, 18.8856f, 13f, 17f)
        verticalLineTo(16.5f)
        }
        }.build()

        return _geometricShapes02!!
    }

private var _geometricShapes02: ImageVector? = null
