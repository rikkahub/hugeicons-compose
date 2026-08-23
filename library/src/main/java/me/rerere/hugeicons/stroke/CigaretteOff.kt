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

val HugeIcons.CigaretteOff: ImageVector
    get() {
        if (_cigaretteOff != null) {
            return _cigaretteOff!!
        }
        _cigaretteOff = ImageVector.Builder(
            name = "CigaretteOff",
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(19f, 19f)
            horizontalLineTo(4f)
            curveTo(3.53501f, 19f, 3.30252f, 19f, 3.11177f, 18.9489f)
            curveTo(2.59413f, 18.8102f, 2.18981f, 18.4059f, 2.05111f, 17.8882f)
            curveTo(2f, 17.6975f, 2f, 17.465f, 2f, 17f)
            curveTo(2f, 16.535f, 2f, 16.3025f, 2.05111f, 16.1118f)
            curveTo(2.18981f, 15.5941f, 2.59413f, 15.1898f, 3.11177f, 15.0511f)
            curveTo(3.30252f, 15f, 3.53501f, 15f, 4f, 15f)
            horizontalLineTo(15f)
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
            moveTo(22f, 17f)
            curveTo(22f, 16.5228f, 22f, 16.2842f, 21.954f, 16.0885f)
            curveTo(21.8293f, 15.5573f, 21.4656f, 15.1423f, 21f, 15f)
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
            moveTo(22f, 12f)
            verticalLineTo(11f)
            curveTo(22f, 9.11438f, 22f, 8.17157f, 21.4142f, 7.58579f)
            curveTo(20.8284f, 7f, 19.8856f, 7f, 18f, 7f)
            horizontalLineTo(15f)
            curveTo(13.8954f, 7f, 13f, 6.10457f, 13f, 5f)
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
            moveTo(15f, 10f)
            horizontalLineTo(17f)
            curveTo(17.465f, 10f, 17.6975f, 10f, 17.8882f, 10.0511f)
            curveTo(18.4059f, 10.1898f, 18.8102f, 10.5941f, 18.9489f, 11.1118f)
            curveTo(19f, 11.3025f, 19f, 11.535f, 19f, 12f)
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
            moveTo(7f, 15f)
            verticalLineTo(19f)
        }
        }.build()

        return _cigaretteOff!!
    }

private var _cigaretteOff: ImageVector? = null
