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

val HugeIcons.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = ImageVector.Builder(
            name = "Printer",
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
            moveTo(17f, 17f)
            horizontalLineTo(18.6667f)
            curveTo(19.9128f, 17f, 20.5359f, 17f, 21f, 16.7321f)
            curveTo(21.304f, 16.5565f, 21.5565f, 16.304f, 21.732f, 16f)
            curveTo(22f, 15.5359f, 22f, 14.9128f, 22f, 13.6667f)
            curveTo(22f, 11.1744f, 22f, 9.9282f, 21.4641f, 9f)
            curveTo(21.113f, 8.39192f, 20.6081f, 7.88697f, 20f, 7.5359f)
            curveTo(19.0718f, 7f, 17.8256f, 7f, 15.3333f, 7f)
            horizontalLineTo(8.66667f)
            curveTo(6.17436f, 7f, 4.9282f, 7f, 4f, 7.5359f)
            curveTo(3.39192f, 7.88697f, 2.88697f, 8.39192f, 2.5359f, 9f)
            curveTo(2f, 9.9282f, 2f, 11.1744f, 2f, 13.6667f)
            curveTo(2f, 14.9128f, 2f, 15.5359f, 2.26795f, 16f)
            curveTo(2.44349f, 16.304f, 2.69596f, 16.5565f, 3f, 16.7321f)
            curveTo(3.4641f, 17f, 4.08718f, 17f, 5.33333f, 17f)
            horizontalLineTo(7f)
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
            moveTo(17f, 7f)
            verticalLineTo(5f)
            curveTo(17f, 3.58579f, 17f, 2.87868f, 16.5607f, 2.43934f)
            curveTo(16.1213f, 2f, 15.4142f, 2f, 14f, 2f)
            horizontalLineTo(10f)
            curveTo(8.58579f, 2f, 7.87868f, 2f, 7.43934f, 2.43934f)
            curveTo(7f, 2.87868f, 7f, 3.58579f, 7f, 5f)
            verticalLineTo(7f)
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
            moveTo(17f, 14f)
            verticalLineTo(19f)
            curveTo(17f, 20.4142f, 17f, 21.1213f, 16.5607f, 21.5607f)
            curveTo(16.1213f, 22f, 15.4142f, 22f, 14f, 22f)
            horizontalLineTo(10f)
            curveTo(8.58579f, 22f, 7.87868f, 22f, 7.43934f, 21.5607f)
            curveTo(7f, 21.1213f, 7f, 20.4142f, 7f, 19f)
            verticalLineTo(14f)
            horizontalLineTo(17f)
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
            moveTo(18.8748f, 10.25f)
            horizontalLineTo(18.7498f)
            moveTo(18.9998f, 10.25f)
            curveTo(18.9998f, 10.3881f, 18.8879f, 10.5f, 18.7498f, 10.5f)
            curveTo(18.6117f, 10.5f, 18.4998f, 10.3881f, 18.4998f, 10.25f)
            curveTo(18.4998f, 10.1119f, 18.6117f, 10f, 18.7498f, 10f)
            curveTo(18.8879f, 10f, 18.9998f, 10.1119f, 18.9998f, 10.25f)
            close()
        }
        }.build()

        return _printer!!
    }

private var _printer: ImageVector? = null
