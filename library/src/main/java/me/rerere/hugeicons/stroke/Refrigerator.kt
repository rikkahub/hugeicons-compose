package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Refrigerator: ImageVector
    get() {
        if (_refrigerator != null) {
            return _refrigerator!!
        }
        _refrigerator = ImageVector.Builder(
            name = "Refrigerator",
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
        moveTo(5f, 6f)
        curveTo(5f, 4.11438f, 5f, 3.17157f, 5.58579f, 2.58579f)
        curveTo(6.17157f, 2f, 7.11438f, 2f, 9f, 2f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 2f, 17.8284f, 2f, 18.4142f, 2.58579f)
        curveTo(19f, 3.17157f, 19f, 4.11438f, 19f, 6f)
        verticalLineTo(20f)
        curveTo(19f, 20.9428f, 19f, 21.4142f, 18.7071f, 21.7071f)
        curveTo(18.4142f, 22f, 17.9428f, 22f, 17f, 22f)
        horizontalLineTo(7f)
        curveTo(6.05719f, 22f, 5.58579f, 22f, 5.29289f, 21.7071f)
        curveTo(5f, 21.4142f, 5f, 20.9428f, 5f, 20f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(8.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 13f)
        horizontalLineTo(8.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 10f)
        horizontalLineTo(19f)
        }
        }.build()

        return _refrigerator!!
    }

private var _refrigerator: ImageVector? = null
