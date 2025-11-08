package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Contracts: ImageVector
    get() {
        if (_contracts != null) {
            return _contracts!!
        }
        _contracts = ImageVector.Builder(
            name = "Contracts",
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
        moveTo(18f, 6f)
        curveTo(17.9531f, 4.44655f, 17.7797f, 3.51998f, 17.1377f, 2.87868f)
        curveTo(16.2581f, 2f, 14.8423f, 2f, 12.0108f, 2f)
        horizontalLineTo(8.0065f)
        curveTo(5.17501f, 2f, 3.75926f, 2f, 2.87963f, 2.87868f)
        curveTo(2f, 3.75736f, 2f, 5.17157f, 2f, 8f)
        verticalLineTo(16f)
        curveTo(2f, 18.8284f, 2f, 20.2426f, 2.87963f, 21.1213f)
        curveTo(3.75926f, 22f, 5.17501f, 22f, 8.0065f, 22f)
        horizontalLineTo(12.0108f)
        curveTo(14.8423f, 22f, 16.2581f, 22f, 17.1377f, 21.1213f)
        curveTo(17.7797f, 20.48f, 17.9531f, 19.5535f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.2419f, 11.7419f)
        lineTo(21.419f, 10.5648f)
        curveTo(21.6894f, 10.2944f, 21.8246f, 10.1592f, 21.8969f, 10.0134f)
        curveTo(22.0344f, 9.73584f, 22.0344f, 9.41003f, 21.8969f, 9.13252f)
        curveTo(21.8246f, 8.98666f, 21.6894f, 8.85145f, 21.419f, 8.58104f)
        curveTo(21.1485f, 8.31062f, 21.0133f, 8.17542f, 20.8675f, 8.10314f)
        curveTo(20.59f, 7.96562f, 20.2642f, 7.96562f, 19.9866f, 8.10314f)
        curveTo(19.8408f, 8.17542f, 19.7056f, 8.31062f, 19.4352f, 8.58104f)
        lineTo(18.2581f, 9.7581f)
        moveTo(20.2419f, 11.7419f)
        lineTo(14.9757f, 17.0081f)
        lineTo(12f, 18f)
        lineTo(12.9919f, 15.0243f)
        lineTo(18.2581f, 9.7581f)
        moveTo(20.2419f, 11.7419f)
        lineTo(18.2581f, 9.7581f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 19f)
        horizontalLineTo(6f)
        lineTo(7.25f, 16.5f)
        lineTo(8.5f, 19f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10f)
        horizontalLineTo(12f)
        }
        }.build()

        return _contracts!!
    }

private var _contracts: ImageVector? = null
