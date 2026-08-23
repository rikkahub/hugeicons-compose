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

val HugeIcons.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = ImageVector.Builder(
            name = "Toolbox",
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
            moveTo(3f, 15f)
            verticalLineTo(14f)
            horizontalLineTo(21f)
            verticalLineTo(15f)
            curveTo(21f, 17.8284f, 21f, 19.2426f, 20.1213f, 20.1213f)
            curveTo(19.2426f, 21f, 17.8284f, 21f, 15f, 21f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 21f, 4.75736f, 21f, 3.87868f, 20.1213f)
            curveTo(3f, 19.2426f, 3f, 17.8284f, 3f, 15f)
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
            moveTo(3f, 14f)
            lineTo(3.00001f, 12.9999f)
            curveTo(3.00003f, 11.5278f, 3.00004f, 10.7918f, 3.31675f, 10.1584f)
            curveTo(3.63347f, 9.52493f, 4.22231f, 9.08329f, 5.39999f, 8.20002f)
            curveTo(6.19297f, 7.60528f, 6.58946f, 7.30791f, 7.05132f, 7.15395f)
            curveTo(7.51317f, 7f, 8.00879f, 7f, 9.00002f, 7f)
            horizontalLineTo(15f)
            curveTo(15.9912f, 7f, 16.4868f, 7f, 16.9487f, 7.15395f)
            curveTo(17.4105f, 7.3079f, 17.807f, 7.60527f, 18.6f, 8.2f)
            curveTo(19.7777f, 9.08328f, 20.3666f, 9.52492f, 20.6833f, 10.1584f)
            curveTo(21f, 10.7918f, 21f, 11.5279f, 21f, 13f)
            verticalLineTo(14f)
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
            moveTo(16f, 12f)
            verticalLineTo(16f)
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
            moveTo(8f, 12f)
            verticalLineTo(16f)
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
            moveTo(8.49997f, 7.00006f)
            verticalLineTo(6.50006f)
            curveTo(8.49997f, 5.0956f, 8.49997f, 4.39337f, 8.83703f, 3.88892f)
            curveTo(8.98295f, 3.67054f, 9.17045f, 3.48304f, 9.38883f, 3.33712f)
            curveTo(9.89328f, 3.00006f, 10.5955f, 3.00006f, 12f, 3.00006f)
            curveTo(13.4044f, 3.00006f, 14.1067f, 3.00006f, 14.6111f, 3.33712f)
            curveTo(14.8295f, 3.48304f, 15.017f, 3.67054f, 15.1629f, 3.88892f)
            curveTo(15.5f, 4.39337f, 15.5f, 5.0956f, 15.5f, 6.50006f)
            verticalLineTo(7.00006f)
        }
        }.build()

        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
