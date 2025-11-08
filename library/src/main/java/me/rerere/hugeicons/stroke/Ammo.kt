package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ammo: ImageVector
    get() {
        if (_ammo != null) {
            return _ammo!!
        }
        _ammo = ImageVector.Builder(
            name = "Ammo",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 8.5f)
        curveTo(9.5f, 5.5f, 8f, 2.5f, 8f, 2.5f)
        curveTo(8f, 2.5f, 6.5f, 5.5f, 6.5f, 8.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        lineTo(9.5f, 8.5f)
        horizontalLineTo(6.5f)
        lineTo(6f, 11f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        horizontalLineTo(6f)
        verticalLineTo(18.5f)
        curveTo(6f, 19.0523f, 6.44772f, 19.5f, 7f, 19.5f)
        horizontalLineTo(9f)
        curveTo(9.55228f, 19.5f, 10f, 19.0523f, 10f, 18.5f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22.5f)
        horizontalLineTo(6f)
        verticalLineTo(20.5f)
        curveTo(6f, 19.9477f, 6.44772f, 19.5f, 7f, 19.5f)
        horizontalLineTo(9f)
        curveTo(9.55228f, 19.5f, 10f, 19.9477f, 10f, 20.5f)
        verticalLineTo(22.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 8.5f)
        curveTo(17.5f, 5.5f, 16f, 2.5f, 16f, 2.5f)
        curveTo(16f, 2.5f, 14.5f, 5.5f, 14.5f, 8.5f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        lineTo(17.5f, 8.5f)
        horizontalLineTo(14.5f)
        lineTo(14f, 11f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        horizontalLineTo(14f)
        verticalLineTo(18.5f)
        curveTo(14f, 19.0523f, 14.4477f, 19.5f, 15f, 19.5f)
        horizontalLineTo(17f)
        curveTo(17.5523f, 19.5f, 18f, 19.0523f, 18f, 18.5f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 22.5f)
        horizontalLineTo(14f)
        verticalLineTo(20.5f)
        curveTo(14f, 19.9477f, 14.4477f, 19.5f, 15f, 19.5f)
        horizontalLineTo(17f)
        curveTo(17.5523f, 19.5f, 18f, 19.9477f, 18f, 20.5f)
        verticalLineTo(22.5f)
        }
        }.build()

        return _ammo!!
    }

private var _ammo: ImageVector? = null
