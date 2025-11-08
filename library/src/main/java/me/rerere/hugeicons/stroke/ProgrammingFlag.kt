package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ProgrammingFlag: ImageVector
    get() {
        if (_programmingFlag != null) {
            return _programmingFlag!!
        }
        _programmingFlag = ImageVector.Builder(
            name = "ProgrammingFlag",
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
        moveTo(4f, 7f)
        curveTo(4f, 5.11438f, 4f, 4.17157f, 4.58579f, 3.58579f)
        curveTo(5.17157f, 3f, 6.11438f, 3f, 8f, 3f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 3f, 19.2426f, 3f, 20.1213f, 3.87868f)
        curveTo(21f, 4.75736f, 21f, 6.17157f, 21f, 9f)
        curveTo(21f, 11.8284f, 21f, 13.2426f, 20.1213f, 14.1213f)
        curveTo(19.2426f, 15f, 17.8284f, 15f, 15f, 15f)
        horizontalLineTo(4f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        lineTo(4f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        lineTo(17.2265f, 8.05719f)
        curveTo(17.7422f, 8.50163f, 18f, 8.72386f, 18f, 9f)
        curveTo(18f, 9.27614f, 17.7422f, 9.49836f, 17.2265f, 9.94281f)
        lineTo(16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7f)
        lineTo(7.77346f, 8.05719f)
        curveTo(7.25782f, 8.50163f, 7f, 8.72386f, 7f, 9f)
        curveTo(7f, 9.27614f, 7.25782f, 9.49836f, 7.77346f, 9.94281f)
        lineTo(9f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7f)
        lineTo(11.5f, 11f)
        }
        }.build()

        return _programmingFlag!!
    }

private var _programmingFlag: ImageVector? = null
