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

val HugeIcons.UserCog: ImageVector
    get() {
        if (_userCog != null) {
            return _userCog!!
        }
        _userCog = ImageVector.Builder(
            name = "UserCog",
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
            moveTo(19.6709f, 16.2593f)
            curveTo(19.8803f, 16.6249f, 20f, 17.0485f, 20f, 17.5f)
            curveTo(20f, 17.9514f, 19.8804f, 18.3749f, 19.671f, 18.7404f)
            curveTo(19.2402f, 19.493f, 18.4293f, 20f, 17.5f, 20f)
            moveTo(15.3291f, 16.2593f)
            curveTo(15.1197f, 16.6249f, 15f, 17.0485f, 15f, 17.5f)
            curveTo(15f, 17.9514f, 15.1196f, 18.3749f, 15.329f, 18.7404f)
            curveTo(15.7598f, 19.493f, 16.5707f, 20f, 17.5f, 20f)
            moveTo(17.5f, 20f)
            lineTo(17.5f, 21.5f)
            moveTo(17.5f, 15f)
            curveTo(18.4292f, 15f, 19.24f, 15.5069f, 19.6709f, 16.2593f)
            moveTo(17.5f, 15f)
            curveTo(16.5708f, 15f, 15.76f, 15.5069f, 15.3291f, 16.2593f)
            moveTo(17.5f, 15f)
            lineTo(17.5f, 13.5f)
            moveTo(21f, 15.4998f)
            lineTo(19.6709f, 16.2593f)
            moveTo(14f, 19.4998f)
            lineTo(15.329f, 18.7404f)
            moveTo(21f, 19.4998f)
            lineTo(19.671f, 18.7404f)
            moveTo(14f, 15.4998f)
            lineTo(15.3291f, 16.2593f)
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
            moveTo(2.5f, 18.5f)
            verticalLineTo(16.4704f)
            curveTo(2.5f, 15.2281f, 3.05927f, 14.0099f, 4.18968f, 13.4946f)
            curveTo(5.5685f, 12.8661f, 7.22212f, 12.5f, 9f, 12.5f)
            curveTo(10.0541f, 12.5f, 11.0646f, 12.6287f, 12f, 12.8645f)
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
            moveTo(12.5f, 6f)
            arcTo(3.5f, 3.5f, 0f, true, false, 5.5f, 6f)
            arcTo(3.5f, 3.5f, 0f, true, false, 12.5f, 6f)
            close()
        }
        }.build()

        return _userCog!!
    }

private var _userCog: ImageVector? = null
