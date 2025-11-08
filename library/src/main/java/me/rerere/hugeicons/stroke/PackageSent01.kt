package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageSent01: ImageVector
    get() {
        if (_packageSent01 != null) {
            return _packageSent01!!
        }
        _packageSent01 = ImageVector.Builder(
            name = "PackageSent01",
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
        moveTo(2.5f, 7.5f)
        verticalLineTo(13.5f)
        curveTo(2.5f, 17.2712f, 2.5f, 19.1569f, 3.67157f, 20.3284f)
        curveTo(4.84315f, 21.5f, 6.72876f, 21.5f, 10.5f, 21.5f)
        horizontalLineTo(14f)
        moveTo(21.5f, 12f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.86909f, 5.31461f)
        lineTo(2.5f, 7.5f)
        horizontalLineTo(21.5f)
        lineTo(20.2478f, 5.41303f)
        curveTo(19.3941f, 3.99021f, 18.9673f, 3.2788f, 18.2795f, 2.8894f)
        curveTo(17.5918f, 2.5f, 16.7621f, 2.5f, 15.1029f, 2.5f)
        horizontalLineTo(8.95371f)
        curveTo(7.32998f, 2.5f, 6.51812f, 2.5f, 5.84013f, 2.8753f)
        curveTo(5.16215f, 3.2506f, 4.73113f, 3.93861f, 3.86909f, 5.31461f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7.5f)
        verticalLineTo(2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 10.5f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17.5f)
        curveTo(21.5f, 17.5f, 19.2905f, 14.5f, 18.5f, 14.5f)
        curveTo(17.7094f, 14.5f, 15.5f, 17.5f, 15.5f, 17.5f)
        moveTo(18.5f, 15f)
        verticalLineTo(21.5f)
        }
        }.build()

        return _packageSent01!!
    }

private var _packageSent01: ImageVector? = null
