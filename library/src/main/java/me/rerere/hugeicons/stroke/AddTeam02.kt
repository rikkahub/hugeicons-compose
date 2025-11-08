package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddTeam02: ImageVector
    get() {
        if (_addTeam02 != null) {
            return _addTeam02!!
        }
        _addTeam02 = ImageVector.Builder(
            name = "AddTeam02",
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
        moveTo(3f, 20f)
        verticalLineTo(17.9704f)
        curveTo(3f, 16.7281f, 3.55927f, 15.5099f, 4.68968f, 14.9946f)
        curveTo(6.0685f, 14.3661f, 7.72212f, 14f, 9.5f, 14f)
        curveTo(10.7448f, 14f, 11.9287f, 14.1795f, 13f, 14.5028f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 4.14453f)
        curveTo(15.9457f, 4.57481f, 17f, 5.91408f, 17f, 7.49959f)
        curveTo(17f, 9.0851f, 15.9457f, 10.4244f, 14.5f, 10.8547f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14f)
        verticalLineTo(20f)
        moveTo(15f, 17f)
        horizontalLineTo(21f)
        }
        }.build()

        return _addTeam02!!
    }

private var _addTeam02: ImageVector? = null
