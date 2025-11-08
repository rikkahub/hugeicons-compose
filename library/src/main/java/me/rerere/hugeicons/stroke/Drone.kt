package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = ImageVector.Builder(
            name = "Drone",
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
        moveTo(12f, 7f)
        curveTo(6.47715f, 7f, 2f, 7.89543f, 2f, 9f)
        curveTo(2f, 9.80571f, 4.38215f, 10.5001f, 7.81468f, 10.8169f)
        curveTo(8.43288f, 10.874f, 8.85702f, 11.4721f, 8.92296f, 12.0894f)
        curveTo(9.09436f, 13.6942f, 10.384f, 15f, 12f, 15f)
        curveTo(13.616f, 15f, 14.9056f, 13.6942f, 15.077f, 12.0894f)
        curveTo(15.143f, 11.4721f, 15.5671f, 10.874f, 16.1853f, 10.8169f)
        curveTo(19.6179f, 10.5001f, 22f, 9.80571f, 22f, 9f)
        curveTo(22f, 7.89543f, 17.5228f, 7f, 12f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 12f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 3f)
        horizontalLineTo(6f)
        moveTo(8f, 3f)
        horizontalLineTo(6f)
        moveTo(6f, 3f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        horizontalLineTo(18f)
        moveTo(20f, 3f)
        horizontalLineTo(18f)
        moveTo(18f, 3f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 21f)
        verticalLineTo(19.5f)
        curveTo(5f, 16.7386f, 7.23858f, 14.5f, 10f, 14.5f)
        moveTo(19f, 21f)
        verticalLineTo(19.5f)
        curveTo(19f, 16.7386f, 16.7614f, 14.5f, 14f, 14.5f)
        }
        }.build()

        return _drone!!
    }

private var _drone: ImageVector? = null
