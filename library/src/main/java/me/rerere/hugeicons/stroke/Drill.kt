package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drill: ImageVector
    get() {
        if (_drill != null) {
            return _drill!!
        }
        _drill = ImageVector.Builder(
            name = "Drill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 11f)
            horizontalLineTo(6f)
            curveTo(5.07003f, 11f, 4.60504f, 11f, 4.22354f, 10.8978f)
            curveTo(3.18827f, 10.6204f, 2.37962f, 9.81173f, 2.10222f, 8.77646f)
            curveTo(2f, 8.39496f, 2f, 7.92997f, 2f, 7f)
            curveTo(2f, 6.07003f, 2f, 5.60504f, 2.10222f, 5.22354f)
            curveTo(2.37962f, 4.18827f, 3.18827f, 3.37962f, 4.22354f, 3.10222f)
            curveTo(4.60504f, 3f, 5.07003f, 3f, 6f, 3f)
            horizontalLineTo(10f)
            curveTo(11.8856f, 3f, 12.8284f, 3f, 13.4142f, 3.58579f)
            curveTo(14f, 4.17157f, 14f, 5.11438f, 14f, 7f)
            curveTo(14f, 8.88562f, 14f, 9.82843f, 13.4142f, 10.4142f)
            curveTo(12.8284f, 11f, 11.8856f, 11f, 10f, 11f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 20f)
            verticalLineTo(19f)
            curveTo(2f, 18.4477f, 2.44772f, 18f, 3f, 18f)
            horizontalLineTo(9f)
            curveTo(10.1046f, 18f, 11f, 18.8954f, 11f, 20f)
            curveTo(11f, 20.5523f, 10.5523f, 21f, 10f, 21f)
            horizontalLineTo(3f)
            curveTo(2.44772f, 21f, 2f, 20.5523f, 2f, 20f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11f, 11f)
            verticalLineTo(12f)
            curveTo(11f, 13.1046f, 11.8954f, 14f, 13f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 18f)
            lineTo(5f, 11f)
            horizontalLineTo(9f)
            lineTo(7f, 18f)
            horizontalLineTo(3f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 7f)
            horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 9f)
            horizontalLineTo(16f)
            curveTo(16.465f, 9f, 16.6975f, 9f, 16.8882f, 8.94889f)
            curveTo(17.4059f, 8.81019f, 17.8102f, 8.40587f, 17.9489f, 7.88823f)
            curveTo(18f, 7.69748f, 18f, 7.46499f, 18f, 7f)
            curveTo(18f, 6.53501f, 18f, 6.30252f, 17.9489f, 6.11177f)
            curveTo(17.8102f, 5.59413f, 17.4059f, 5.18981f, 16.8882f, 5.05111f)
            curveTo(16.6975f, 5f, 16.465f, 5f, 16f, 5f)
            horizontalLineTo(14f)
            verticalLineTo(9f)
            close()
        }
        }.build()

        return _drill!!
    }

private var _drill: ImageVector? = null
