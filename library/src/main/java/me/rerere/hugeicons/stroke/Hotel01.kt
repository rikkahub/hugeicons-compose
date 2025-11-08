package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hotel01: ImageVector
    get() {
        if (_hotel01 != null) {
            return _hotel01!!
        }
        _hotel01 = ImageVector.Builder(
            name = "Hotel01",
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
        moveTo(3f, 4f)
        verticalLineTo(20f)
        curveTo(3f, 20.9428f, 3f, 21.4142f, 3.29289f, 21.7071f)
        curveTo(3.58579f, 22f, 4.05719f, 22f, 5f, 22f)
        horizontalLineTo(19f)
        curveTo(19.9428f, 22f, 20.4142f, 22f, 20.7071f, 21.7071f)
        curveTo(21f, 21.4142f, 21f, 20.9428f, 21f, 20f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 8f)
        verticalLineTo(9.5f)
        moveTo(10.5f, 11f)
        verticalLineTo(9.5f)
        moveTo(13.5f, 8f)
        verticalLineTo(9.5f)
        moveTo(13.5f, 11f)
        verticalLineTo(9.5f)
        moveTo(10.5f, 9.5f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 22f)
        lineTo(14f, 17.9999f)
        curveTo(14f, 16.8954f, 13.1046f, 15.9999f, 12f, 15.9999f)
        curveTo(10.8954f, 15.9999f, 10f, 16.8954f, 10f, 17.9999f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 4f)
        horizontalLineTo(8f)
        curveTo(8.6399f, 2.82727f, 10.1897f, 2f, 12f, 2f)
        curveTo(13.8103f, 2f, 15.3601f, 2.82727f, 16f, 4f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        horizontalLineTo(7f)
        moveTo(6f, 12f)
        horizontalLineTo(7f)
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8f)
        horizontalLineTo(18f)
        moveTo(17f, 12f)
        horizontalLineTo(18f)
        moveTo(17f, 16f)
        horizontalLineTo(18f)
        }
        }.build()

        return _hotel01!!
    }

private var _hotel01: ImageVector? = null
