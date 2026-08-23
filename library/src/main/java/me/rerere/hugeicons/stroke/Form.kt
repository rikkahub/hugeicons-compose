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

val HugeIcons.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = ImageVector.Builder(
            name = "Form",
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
            moveTo(18f, 6.25f)
            horizontalLineTo(6f)
            curveTo(5.53501f, 6.25f, 5.30252f, 6.25f, 5.11177f, 6.30111f)
            curveTo(4.59413f, 6.43981f, 4.18981f, 6.84413f, 4.05111f, 7.36177f)
            curveTo(4f, 7.55252f, 4f, 7.78501f, 4f, 8.25f)
            curveTo(4f, 8.71499f, 4f, 8.94748f, 4.05111f, 9.13823f)
            curveTo(4.18981f, 9.65587f, 4.59413f, 10.0602f, 5.11177f, 10.1989f)
            curveTo(5.30252f, 10.25f, 5.53501f, 10.25f, 6f, 10.25f)
            horizontalLineTo(18f)
            curveTo(18.465f, 10.25f, 18.6975f, 10.25f, 18.8882f, 10.1989f)
            curveTo(19.4059f, 10.0602f, 19.8102f, 9.65587f, 19.9489f, 9.13823f)
            curveTo(20f, 8.94748f, 20f, 8.71499f, 20f, 8.25f)
            curveTo(20f, 7.78501f, 20f, 7.55252f, 19.9489f, 7.36177f)
            curveTo(19.8102f, 6.84413f, 19.4059f, 6.43981f, 18.8882f, 6.30111f)
            curveTo(18.6975f, 6.25f, 18.465f, 6.25f, 18f, 6.25f)
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
            moveTo(18f, 17.25f)
            horizontalLineTo(6f)
            curveTo(5.53501f, 17.25f, 5.30252f, 17.25f, 5.11177f, 17.3011f)
            curveTo(4.59413f, 17.4398f, 4.18981f, 17.8441f, 4.05111f, 18.3618f)
            curveTo(4f, 18.5525f, 4f, 18.785f, 4f, 19.25f)
            curveTo(4f, 19.715f, 4f, 19.9475f, 4.05111f, 20.1382f)
            curveTo(4.18981f, 20.6559f, 4.59413f, 21.0602f, 5.11177f, 21.1989f)
            curveTo(5.30252f, 21.25f, 5.53501f, 21.25f, 6f, 21.25f)
            horizontalLineTo(18f)
            curveTo(18.465f, 21.25f, 18.6975f, 21.25f, 18.8882f, 21.1989f)
            curveTo(19.4059f, 21.0602f, 19.8102f, 20.6559f, 19.9489f, 20.1382f)
            curveTo(20f, 19.9475f, 20f, 19.715f, 20f, 19.25f)
            curveTo(20f, 18.785f, 20f, 18.5525f, 19.9489f, 18.3618f)
            curveTo(19.8102f, 17.8441f, 19.4059f, 17.4398f, 18.8882f, 17.3011f)
            curveTo(18.6975f, 17.25f, 18.465f, 17.25f, 18f, 17.25f)
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
            moveTo(4f, 2.75f)
            horizontalLineTo(14f)
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
            moveTo(4f, 13.75f)
            horizontalLineTo(10f)
        }
        }.build()

        return _form!!
    }

private var _form: ImageVector? = null
