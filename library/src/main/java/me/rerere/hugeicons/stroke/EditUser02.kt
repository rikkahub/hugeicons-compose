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

val HugeIcons.EditUser02: ImageVector
    get() {
        if (_editUser02 != null) {
            return _editUser02!!
        }
        _editUser02 = ImageVector.Builder(
            name = "EditUser02",
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
            moveTo(14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
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
            moveTo(11f, 14.0345f)
            curveTo(10.6763f, 14.0118f, 10.3428f, 14f, 10f, 14f)
            curveTo(5f, 14f, 2f, 16.5f, 2f, 19f)
            curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
            horizontalLineTo(16f)
            curveTo(17.1046f, 21f, 18f, 20.1046f, 18f, 19f)
            curveTo(18f, 18.6647f, 17.946f, 18.3293f, 17.8405f, 18f)
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
            moveTo(21.6887f, 8.93395f)
            lineTo(21.0661f, 8.31132f)
            curveTo(20.651f, 7.89623f, 19.978f, 7.89623f, 19.5629f, 8.31131f)
            lineTo(16.2141f, 11.6601f)
            curveTo(15.769f, 12.1052f, 15.4656f, 12.6722f, 15.3421f, 13.2895f)
            lineTo(15f, 15f)
            lineTo(16.7105f, 14.6579f)
            curveTo(17.3278f, 14.5344f, 17.8948f, 14.231f, 18.3399f, 13.7859f)
            lineTo(21.6887f, 10.4371f)
            curveTo(22.1038f, 10.022f, 22.1038f, 9.34903f, 21.6887f, 8.93395f)
            close()
        }
        }.build()

        return _editUser02!!
    }

private var _editUser02: ImageVector? = null
