package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EaseCurveControlPoints: ImageVector
    get() {
        if (_easeCurveControlPoints != null) {
            return _easeCurveControlPoints!!
        }
        _easeCurveControlPoints = ImageVector.Builder(
            name = "EaseCurveControlPoints",
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
        moveTo(21f, 4f)
        curveTo(16f, 4f, 13.9792f, 8.0416f, 12f, 12f)
        curveTo(10.0208f, 15.9584f, 8f, 20f, 3f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20f)
        horizontalLineTo(12f)
        moveTo(15f, 20f)
        lineTo(17f, 20f)
        moveTo(17f, 20f)
        curveTo(17f, 21.1046f, 17.8954f, 22f, 19f, 22f)
        curveTo(20.1046f, 22f, 21f, 21.1046f, 21f, 20f)
        curveTo(21f, 18.8954f, 20.1046f, 18f, 19f, 18f)
        curveTo(17.8954f, 18f, 17f, 18.8954f, 17f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        horizontalLineTo(14f)
        moveTo(7f, 4f)
        lineTo(9f, 4f)
        moveTo(7f, 4f)
        curveTo(7f, 5.10457f, 6.10457f, 6f, 5f, 6f)
        curveTo(3.89543f, 6f, 3f, 5.10457f, 3f, 4f)
        curveTo(3f, 2.89543f, 3.89543f, 2f, 5f, 2f)
        curveTo(6.10457f, 2f, 7f, 2.89543f, 7f, 4f)
        }
        }.build()

        return _easeCurveControlPoints!!
    }

private var _easeCurveControlPoints: ImageVector? = null
